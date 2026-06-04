import java.util.concurrent.atomic.AtomicInteger

def value = new AtomicInteger(0)

def threads = (1..10).collect {
    Thread.start {
        10.times {
            while (true) {
                int cur = value.get()
                if (value.compareAndSet(cur, cur + 1)) break
            }
        }
    }
}
threads*.join()
println value.get()
