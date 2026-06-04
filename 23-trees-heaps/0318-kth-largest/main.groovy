int k = 2
def heap = new PriorityQueue<Integer>()
[3, 2, 1, 5, 6, 4].each {
    heap.add(it)
    if (heap.size() > k) heap.poll()
}
println(heap.peek())
