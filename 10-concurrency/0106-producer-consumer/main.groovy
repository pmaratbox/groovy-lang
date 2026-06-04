import java.util.concurrent.ArrayBlockingQueue

def queue = new ArrayBlockingQueue<Integer>(2)
def DONE = -1

def producer = Thread.start {
    (1..5).each { queue.put(it) }
    queue.put(DONE)
}

int sum = 0
while (true) {
    def v = queue.take()
    if (v == DONE) break
    sum += v
}
producer.join()
println sum
