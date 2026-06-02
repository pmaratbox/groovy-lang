class Node {
    int value
    Node next
    Node(int value, Node next = null) {
        this.value = value
        this.next = next
    }
}

def head = new Node(1, new Node(2, new Node(3)))

def parts = []
def node = head
while (node != null) {
    parts << node.value
    node = node.next
}
println parts.join(" -> ")
