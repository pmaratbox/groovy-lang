// Virtual-time scheduler: deterministic, push-based reactive combineLatest.

class Scheduler {
    // queue entries: [time, seq, callback, alive]
    private List<List> queue = []
    private int seq = 0
    int clock = 0

    def schedule(int time, Closure cb) {
        def entry = [time, seq++, cb, true]
        queue << entry
        entry
    }

    void cancel(List token) { token[3] = false }

    void run() {
        while (!queue.isEmpty()) {
            queue.sort { a, b -> a[0] <=> b[0] ?: a[1] <=> b[1] }
            def entry = queue.remove(0)
            if (!entry[3]) continue
            clock = entry[0]
            (entry[2] as Closure).call()
        }
    }
}

// A source emits by scheduling its events at the given virtual times.
def timed(Scheduler sched, List<List> events) {
    return { observer ->
        events.each { ev ->
            sched.schedule(ev[0]) { observer.next(ev[1]) }
        }
    }
}

def combineLatest(subscribeA, subscribeB) {
    return { observer ->
        def hasA = false, hasB = false
        def latestA = null, latestB = null
        subscribeA([next: { v ->
            latestA = v; hasA = true
            if (hasA && hasB) observer.next("(${latestA}, ${latestB})")
        }])
        subscribeB([next: { v ->
            latestB = v; hasB = true
            if (hasA && hasB) observer.next("(${latestA}, ${latestB})")
        }])
    }
}

def sched = new Scheduler()
def a = timed(sched, [[1, 1], [3, 2]])
def b = timed(sched, [[2, 10]])

combineLatest(a, b)([next: { v -> println v }])
sched.run()
