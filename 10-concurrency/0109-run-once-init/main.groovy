import java.util.concurrent.atomic.AtomicInteger

def initCount = new AtomicInteger(0)
def done = false
def lock = new Object()

def initialize = {
    synchronized (lock) {
        if (!done) {
            initCount.incrementAndGet()
            done = true
        }
    }
}

def threads = (1..10).collect { Thread.start(initialize) }
threads*.join()
println "init count: ${initCount.get()}"
