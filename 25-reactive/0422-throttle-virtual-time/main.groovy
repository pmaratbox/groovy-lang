// Throttle (leading edge) on a virtual-time scheduler.

class Scheduler {
    private List<Map> queue = []
    private int seq = 0
    int now = 0

    Map schedule(int time, Closure cb) {
        def task = [time: time, seq: seq++, cb: cb, dead: false]
        queue << task
        task
    }

    void cancel(Map token) { token.dead = true }

    void run() {
        while (true) {
            def pending = queue.findAll { !it.dead }
            if (pending.isEmpty()) break
            def task = pending.min { a, b ->
                a.time != b.time ? a.time <=> b.time : a.seq <=> b.seq
            }
            queue.remove(task)
            now = task.time
            task.cb()
        }
    }
}

// Source emits values at given virtual times by scheduling them.
def source(Scheduler sched, List events) {
    return { Map observer ->
        events.each { e ->
            sched.schedule(e.time) { observer.next(e.value) }
        }
    }
}

// throttle(window): emit, then suppress further values for `window` ticks.
def throttle(Scheduler sched, int window, Closure upstream) {
    return { Map observer ->
        int blockUntil = 0
        upstream([next: { value ->
            if (sched.now >= blockUntil) {
                observer.next(value)
                blockUntil = sched.now + window
            }
        }])
    }
}

def sched = new Scheduler()
def src = source(sched, [
    [value: 'a', time: 10],
    [value: 'b', time: 20],
    [value: 'c', time: 100],
    [value: 'd', time: 110],
])
def throttled = throttle(sched, 30, src)
throttled([next: { v -> println v }])
sched.run()
