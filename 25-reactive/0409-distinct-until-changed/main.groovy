// A minimal push-based Observable implemented from scratch.
// An observer is a map of closures: next / error / complete.
// subscribe wires a producer closure to the observer.
class Observable {
    Closure producer

    Observable(Closure producer) { this.producer = producer }

    void subscribe(Map observer) { producer(observer) }

    // distinctUntilChanged: forward a value only when it differs from
    // the last emitted one, dropping consecutive duplicates.
    Observable distinctUntilChanged() {
        new Observable({ observer ->
            boolean hasLast = false
            def last = null
            this.subscribe([
                next: { v ->
                    if (!hasLast || v != last) {
                        hasLast = true
                        last = v
                        observer.next(v)
                    }
                },
                error: { e -> observer.error(e) },
                complete: { -> observer.complete() }
            ])
        })
    }

    // Build an Observable that synchronously emits the given values.
    static Observable of(List values) {
        new Observable({ observer ->
            values.each { observer.next(it) }
            observer.complete()
        })
    }
}

Observable.of([1, 1, 2, 2, 2, 3, 1])
        .distinctUntilChanged()
        .subscribe([
            next: { v -> println v },
            error: { e -> },
            complete: { -> }
        ])
