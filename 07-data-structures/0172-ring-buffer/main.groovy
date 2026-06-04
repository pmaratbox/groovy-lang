class RingBuffer {
    int cap
    def data
    int head = 0
    int size = 0
    RingBuffer(int cap) { this.cap = cap; this.data = new Object[cap] }
    void push(item) {
        data[(head + size) % cap] = item
        if (size < cap) size++ else head = (head + 1) % cap
    }
    def toList() { (0..<size).collect { data[(head + it) % cap] } }
}

def rb = new RingBuffer(3)
[1, 2, 3, 4, 5].each { rb.push(it) }
println rb.toList().join(' ')
