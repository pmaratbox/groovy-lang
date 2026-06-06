// A push-based Observable built from scratch. subscribe() returns a
// Subscription whose unsubscribe() flips a "closed" flag; the producer
// checks that flag before each next so an infinite source can be stopped.

class Subscription {
    boolean closed = false
    void unsubscribe() { closed = true }
}

class Observable {
    final Closure producer

    Observable(Closure producer) { this.producer = producer }

    Subscription subscribe(Map observer) {
        def sub = new Subscription()
        producer(observer, sub)
        return sub
    }
}

// Unbounded source of the natural numbers 1,2,3,4,... It checks the
// closed flag before each emission, so once an operator unsubscribes
// the loop stops and the "infinite" stream halts.
def naturals = new Observable({ observer, sub ->
    int n = 1
    while (!sub.closed) {
        observer.next(n, sub)
        n++
    }
})

// take(n): count emissions; after the nth, complete and unsubscribe the
// source so it stops being driven.
Observable take(Observable source, int n) {
    new Observable({ observer, sub ->
        int taken = 0
        source.subscribe(
            next: { value, srcSub ->
                if (taken < n) {
                    observer.next(value)
                    taken++
                    if (taken == n) {
                        if (observer.complete) observer.complete()
                        srcSub.unsubscribe()
                    }
                }
            }
        )
    })
}

take(naturals, 3).subscribe(
    next: { println it },
    complete: { println 'completed' }
)
