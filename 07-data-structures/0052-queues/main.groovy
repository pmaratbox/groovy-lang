def queue = new LinkedList<Integer>()
queue.add(1)
queue.add(2)
queue.add(3)

def out = []
while (!queue.isEmpty()) {
    out << queue.removeFirst()
}
println out.join(" ")
