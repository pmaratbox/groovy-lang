// A minimal push-based Observable implemented from scratch.
class Observable {
    final Closure producer // producer(observer) wires events to the observer

    Observable(Closure producer) {
        this.producer = producer
    }

    def subscribe(observer) {
        producer(observer)
    }
}

// filter forwards a value only when pred(value) is true.
static Observable filter(Observable source, Closure pred) {
    new Observable({ observer ->
        source.subscribe([
            next    : { v -> if (pred(v)) observer.next(v) },
            error   : { e -> observer.error(e) },
            complete: {     observer.complete() },
        ])
    })
}

// Source emits 1,2,3,4,5,6 synchronously.
def source = new Observable({ observer ->
    (1..6).each { observer.next(it) }
    observer.complete()
})

def evens = filter(source) { it % 2 == 0 }

evens.subscribe([
    next    : { v -> println v },
    error   : { e -> },
    complete: {     },
])
