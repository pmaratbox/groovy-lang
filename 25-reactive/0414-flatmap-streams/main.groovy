// FlatMap (mergeMap): map each outer value to an inner timed stream and
// merge all inners concurrently (no cancellation). Driven by a virtual clock.

class Scheduler {
    // priority queue of [time, seq, callback]; ties break by insertion seq
    private final List<List> queue = []
    private int seq = 0
    int now = 0

    void schedule(int time, Closure cb) {
        queue << [time, seq++, cb]
    }

    void run() {
        while (!queue.isEmpty()) {
            queue.sort { a, b -> a[0] <=> b[0] ?: a[1] <=> b[1] }
            def item = queue.remove(0)
            now = item[0] as int
            (item[2] as Closure).call()
        }
    }
}

// An observable is just a closure: subscribe(observer) wires producer to observer.
// observer = [next: {...}, complete: {...}]

// Outer source: emits 1 at t=10, 2 at t=20 (relative to subscribe time).
Closure outer(Scheduler s) {
    return { observer ->
        int base = s.now
        s.schedule(base + 10) { observer.next(1) }
        s.schedule(base + 20) { observer.next(2) }
    }
}

// Inner source for value n: emits n at now+5, n*10 at now+30.
Closure inner(Scheduler s, int n) {
    return { observer ->
        int base = s.now
        s.schedule(base + 5) { observer.next(n) }
        s.schedule(base + 30) { observer.next(n * 10) }
    }
}

// flatMap: subscribe to outer; for each outer value, map to an inner stream
// and subscribe to it immediately, merging all inner emissions.
Closure flatMap(Scheduler s, Closure source, Closure project) {
    return { observer ->
        source.call([next: { v ->
            Closure innerObs = project.call(v)
            innerObs.call([next: { iv -> observer.next(iv) }])
        }])
    }
}

def sched = new Scheduler()
def merged = flatMap(sched, outer(sched)) { n -> inner(sched, n) }
merged.call([next: { v -> println v }])
sched.run()
