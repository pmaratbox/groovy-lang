// A minimal push-based Observable: subscribe wires a producer to an observer
// (a map of next/error/complete closures). Fully synchronous and deterministic.
class Observable {
    Closure onSubscribe

    Observable(Closure onSubscribe) { this.onSubscribe = onSubscribe }

    def subscribe(Map observer) {
        onSubscribe(observer)
    }

    // Emits the given values in order, then completes.
    static Observable of(List values) {
        new Observable({ observer ->
            values.each { observer.next(it) }
            observer.complete()
        })
    }
}

// concat(a, b): subscribe to a; on a.complete, subscribe to b;
// on b.complete, complete the downstream observer.
def concat(Observable a, Observable b) {
    new Observable({ observer ->
        a.subscribe([
            next    : { observer.next(it) },
            error   : { observer.error(it) },
            complete: {
                b.subscribe([
                    next    : { observer.next(it) },
                    error   : { observer.error(it) },
                    complete: { observer.complete() }
                ])
            }
        ])
    })
}

def a = Observable.of([1, 2])
def b = Observable.of([3, 4])

concat(a, b).subscribe([
    next    : { println it },
    error   : { e -> println "error: $e" },
    complete: { }
])
