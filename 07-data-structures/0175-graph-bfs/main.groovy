def adj = [
    0: [1, 2],
    1: [0, 3],
    2: [0, 3],
    3: [1, 2],
]

def visited = [] as Set
def queue = new LinkedList<Integer>()
def order = []
queue.add(0); visited << 0
while (!queue.isEmpty()) {
    def node = queue.poll()
    order << node
    adj[node].each { n ->
        if (!visited.contains(n)) { visited << n; queue.add(n) }
    }
}
println order.join(' ')
