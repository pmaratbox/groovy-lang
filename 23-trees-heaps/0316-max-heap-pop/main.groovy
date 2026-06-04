def heap = new PriorityQueue<Integer>(Collections.reverseOrder())
[3, 1, 4, 1, 5].each { heap.add(it) }

def top3 = (0..<3).collect { heap.poll() }
println(top3.join(' '))
