// A minimal push-based Observable implemented from scratch.
class Observable {
    // producer is a closure that takes an observer (map with next/error/complete)
    final Closure producer

    Observable(Closure producer) { this.producer = producer }

    void subscribe(Map observer) { producer(observer) }
}

// map operator: returns a new Observable whose next forwards f(value).
Observable map(Observable source, Closure f) {
    new Observable({ observer ->
        source.subscribe([
            next    : { value -> observer.next(f(value)) },
            error   : { e -> observer.error(e) },
            complete: { -> observer.complete() }
        ])
    })
}

// Source emits 1,2,3,4 synchronously.
def source = new Observable({ observer ->
    [1, 2, 3, 4].each { observer.next(it) }
    observer.complete()
})

// f = *2
def doubled = map(source) { it * 2 }

doubled.subscribe([
    next    : { println it },
    error   : { e -> },
    complete: { -> }
])
