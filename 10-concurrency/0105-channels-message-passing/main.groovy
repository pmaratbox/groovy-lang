import java.util.concurrent.LinkedBlockingQueue

def queue = new LinkedBlockingQueue<Integer>()
def DONE = -1

Thread.start {
    [1, 2, 3].each { queue.put(it) }
    queue.put(DONE)
}

def received = []
while (true) {
    def v = queue.take()
    if (v == DONE) break
    received << v
}
println received.join(' ')
