// Virtual-time scheduler: a priority queue of (time, seq, callback).
class Scheduler {
    private List<Map> queue = []
    private int seq = 0
    private final Set<Integer> cancelled = [] as Set
    int clock = 0

    int schedule(int time, Closure cb) {
        int token = seq++
        queue << [time: time, seq: token, cb: cb]
        token
    }

    void cancel(int token) { cancelled << token }

    void run() {
        while (!queue.isEmpty()) {
            queue.sort { a, b -> a.time <=> b.time ?: a.seq <=> b.seq }
            def item = queue.remove(0)
            if (item.seq in cancelled) continue
            clock = item.time
            item.cb()
        }
    }
}

// A push-based Observable built from scratch. The producer schedules its
// emissions onto the scheduler at the given virtual times.
class Observable {
    Closure producer // (observer) -> void

    static Observable timed(Scheduler sched, List<List> events) {
        new Observable(producer: { obs ->
            events.each { ev ->
                sched.schedule(ev[0]) { obs.next(ev[1]) }
            }
        })
    }

    void subscribe(observer) { producer(observer) }
}

// merge subscribes to both sources onto the same observer.
static Observable merge(Observable a, Observable b) {
    new Observable(producer: { obs ->
        a.subscribe(obs)
        b.subscribe(obs)
    })
}

def sched = new Scheduler()
def a = Observable.timed(sched, [[10, 1], [30, 3], [50, 5]])
def b = Observable.timed(sched, [[20, 2], [40, 4], [60, 6]])

def observer = [next: { v -> println v }, error: { e -> }, complete: { -> }]

merge(a, b).subscribe(observer)
sched.run()
