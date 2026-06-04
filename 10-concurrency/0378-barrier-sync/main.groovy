import java.util.concurrent.CyclicBarrier
import java.util.concurrent.atomic.AtomicInteger

def arrived = new AtomicInteger(0)
def barrier = new CyclicBarrier(3)

def threads = (1..3).collect {
    Thread.start {
        arrived.incrementAndGet()
        barrier.await()
    }
}
threads*.join()
println "all reached: ${arrived.get()}"
