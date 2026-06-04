import java.util.concurrent.atomic.AtomicInteger

def counter = new AtomicInteger(0)
def threads = (1..10).collect {
    Thread.start {
        100.times { counter.incrementAndGet() }
    }
}
threads*.join()
println counter.get()
