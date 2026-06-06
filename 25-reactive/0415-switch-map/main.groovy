// switchMap implemented from scratch over a virtual-time scheduler.

class Scheduler {
    private List<Map> queue = []
    private int seq = 0
    int now = 0

    int schedule(int time, Closure cb) {
        def token = seq++
        queue << [time: time, seq: token, cb: cb, dead: false]
        return token
    }

    void cancel(int token) {
        queue.find { it.seq == token }?.dead = true
    }

    void run() {
        while (true) {
            def live = queue.findAll { !it.dead }
            if (live.isEmpty()) break
            def item = live.min { a, b -> a.time <=> b.time ?: a.seq <=> b.seq }
            queue.remove(item)
            now = item.time
            item.cb()
        }
    }
}

// An Observable is a closure taking (scheduler, observer).
// observer is a map with next/error/complete closures.

def source(Scheduler sched, List<List<Integer>> events) {
    return { observer ->
        events.each { ev ->
            sched.schedule(ev[0]) { observer.next(ev[1]) }
        }
    }
}

def switchMap(Scheduler sched, Closure outer, Closure project) {
    return { observer ->
        def currentTokens = []
        def cancelCurrent = {
            currentTokens.each { sched.cancel(it) }
            currentTokens = []
        }
        outer([
            next: { v ->
                cancelCurrent()
                def inner = project(v)
                inner([
                    next: { iv -> observer.next(iv) },
                    schedule: { tok -> currentTokens << tok }
                ])
            }
        ])
    }
}

def sched = new Scheduler()

// inner(n): schedules (now+5 -> n), (now+30 -> n*10)
def innerSource = { int n ->
    return { innerObserver ->
        def t1 = sched.schedule(sched.now + 5) { innerObserver.next(n) }
        def t2 = sched.schedule(sched.now + 30) { innerObserver.next(n * 10) }
        innerObserver.schedule(t1)
        innerObserver.schedule(t2)
    }
}

// outer: (10->1),(20->2)
def outer = source(sched, [[10, 1], [20, 2]])

def result = switchMap(sched, outer) { n -> innerSource(n) }

result([next: { v -> println v }])

sched.run()
