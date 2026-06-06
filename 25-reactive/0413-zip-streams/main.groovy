// Zip Streams: pair values by index and combine them with a+b.
// A push-based Observable implemented from scratch, fully synchronous.

class Observable {
    Closure onSubscribe // (observer) -> void

    Observable(Closure onSubscribe) { this.onSubscribe = onSubscribe }

    void subscribe(Map observer) { onSubscribe(observer) }

    static Observable of(List items) {
        new Observable({ obs ->
            items.each { obs.next(it) }
            obs.complete?.call()
        })
    }
}

// zip: buffer each source in a per-source queue; whenever both queues are
// non-empty, dequeue one from each and emit combine(x, y).
Observable zip(Observable a, Observable b, Closure combine) {
    new Observable({ obs ->
        def qa = new ArrayDeque()
        def qb = new ArrayDeque()
        def drain = {
            while (!qa.isEmpty() && !qb.isEmpty()) {
                obs.next(combine(qa.poll(), qb.poll()))
            }
        }
        a.subscribe([next: { x -> qa.add(x); drain() }])
        b.subscribe([next: { y -> qb.add(y); drain() }])
    })
}

def a = Observable.of([1, 2, 3])
def b = Observable.of([10, 20, 30])

zip(a, b, { x, y -> x + y }).subscribe([next: { println it }])
