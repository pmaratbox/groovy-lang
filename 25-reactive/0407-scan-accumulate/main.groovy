// A minimal push-based Observable implemented from scratch.
class Observable {
    final Closure onSubscribe

    Observable(Closure onSubscribe) {
        this.onSubscribe = onSubscribe
    }

    void subscribe(Map observer) {
        onSubscribe(observer)
    }

    // Emits a fixed sequence of values synchronously.
    static Observable fromList(List values) {
        new Observable({ observer ->
            values.each { observer.next(it) }
            if (observer.complete) observer.complete()
        })
    }
}

// scan keeps state seeded with acc; for each value state = f(state, value) and emits state.
Observable scan(Observable source, Object acc, Closure f) {
    new Observable({ observer ->
        def state = acc
        source.subscribe(
            next: { value ->
                state = f(state, value)
                observer.next(state)
            },
            complete: { if (observer.complete) observer.complete() }
        )
    })
}

def source = Observable.fromList([1, 2, 3, 4])
def running = scan(source, 0) { state, value -> state + value }
running.subscribe(next: { println it })
