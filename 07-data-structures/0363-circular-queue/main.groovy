class CircularQueue {
    int[] buffer
    int head = 0
    int tail = 0
    int count = 0

    CircularQueue(int capacity) {
        buffer = new int[capacity]
    }

    void enqueue(int value) {
        buffer[tail] = value
        tail = (tail + 1) % buffer.length
        count++
    }

    int dequeue() {
        def value = buffer[head]
        head = (head + 1) % buffer.length
        count--
        return value
    }

    List<Integer> contents() {
        (0..<count).collect { buffer[(head + it) % buffer.length] }
    }
}

def queue = new CircularQueue(3)
queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)
queue.dequeue()
queue.enqueue(4)
println(queue.contents().join(' '))
