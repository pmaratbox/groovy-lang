// A push-based Observable built from scratch: subscribe() returns a
// Subscription whose unsubscribe() flips a "closed" flag. The producer
// checks that flag before each next, so values after unsubscribe are dropped.

class Subscription {
    boolean closed = false
    void unsubscribe() { closed = true }
}

class Observable {
    final Closure producer

    Observable(Closure producer) { this.producer = producer }

    Subscription subscribe(Closure onNext) {
        def sub = new Subscription()
        def observer = [
            next: { value -> if (!sub.closed) onNext(value, sub) }
        ]
        producer(observer, sub)
        return sub
    }
}

// Source would push 1,2,3,4 but checks the closed flag before each next.
def source = new Observable({ observer, sub ->
    for (v in [1, 2, 3, 4]) {
        if (sub.closed) break
        observer.next(v)
    }
})

source.subscribe { value, sub ->
    println value
    if (value == 2) sub.unsubscribe()
}
