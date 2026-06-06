// Virtual-time debounce: emit a value only after a quiet gap of `window` ticks.

class Scheduler {
    // priority queue of [time, seq, callback]; cancelled tokens are marked dead
    private List<List> queue = []
    private Set<Integer> cancelled = [] as Set
    private int seq = 0
    long now = 0

    int schedule(long time, Closure cb) {
        int token = seq++
        queue << [time, token, cb]
        token
    }

    void cancel(int token) { cancelled << token }

    void run() {
        while (!queue.isEmpty()) {
            queue.sort { a, b -> a[0] <=> b[0] ?: a[1] <=> b[1] }
            def event = queue.remove(0)
            if (event[1] in cancelled) continue
            now = event[0] as long
            (event[2] as Closure).call()
        }
    }
}

// debounce(window): on each value, cancel any pending emit and reschedule at now+window.
def debounce(Scheduler sched, List<List> source, long window, Closure onNext) {
    Integer pending = null
    source.each { item ->
        def value = item[0]
        def time = item[1] as long
        sched.schedule(time) {
            if (pending != null) sched.cancel(pending)
            pending = sched.schedule(sched.now + window) { onNext(value) }
        }
    }
}

def sched = new Scheduler()
def source = [['a', 10], ['b', 20], ['c', 100]]
debounce(sched, source, 30) { value -> println value }
sched.run()
