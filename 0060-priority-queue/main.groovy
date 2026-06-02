def pq = new PriorityQueue<Integer>()
[3, 1, 2].each { pq.add(it) }

def out = []
while (!pq.isEmpty()) {
    out << pq.poll()
}
println out.join(" ")
