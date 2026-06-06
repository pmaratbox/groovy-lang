// A minimal push-based Observable implemented from scratch.
// An observer is a map of closures: next / error / complete.
class Observable {
    final Closure onSubscribe

    Observable(Closure onSubscribe) {
        this.onSubscribe = onSubscribe
    }

    void subscribe(Map observer) {
        onSubscribe(observer)
    }

    // retry(n): on error, resubscribe to the source up to n more times.
    Observable retry(int n) {
        new Observable({ observer ->
            def attempt
            def remaining = n
            attempt = {
                onSubscribe([
                    next    : observer.next,
                    complete: observer.complete,
                    error   : { err ->
                        if (remaining > 0) {
                            remaining--
                            attempt()
                        } else {
                            observer.error(err)
                        }
                    }
                ])
            }
            attempt()
        })
    }
}

int subscriptionCount = 0
def source = new Observable({ observer ->
    subscriptionCount++
    int k = subscriptionCount
    println "attempt ${k}"
    if (k < 3) {
        observer.error(new RuntimeException("fail"))
    } else {
        observer.next("ok")
        observer.complete()
    }
})

source.retry(2).subscribe([
    next    : { v -> println v },
    error   : { e -> println "error: ${e.message}" },
    complete: { -> }
])
