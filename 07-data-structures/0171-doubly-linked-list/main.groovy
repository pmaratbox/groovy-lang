class Node {
    int value
    Node prev
    Node next
    Node(int value) { this.value = value }
}

def head = new Node(1)
def mid = new Node(2)
def tail = new Node(3)
head.next = mid; mid.prev = head
mid.next = tail; tail.prev = mid

def forward = []
for (def n = head; n != null; n = n.next) forward << n.value
println forward.join(' ')

def backward = []
for (def n = tail; n != null; n = n.prev) backward << n.value
println backward.join(' ')
