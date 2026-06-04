import java.util.PriorityQueue

def n = 4
def adj = (0..<n).collect { [] }
def indeg = [0] * n
[[0,1],[0,2],[1,3],[2,3]].each { u, v -> adj[u] << v; indeg[v]++ }

def pq = new PriorityQueue<Integer>()
(0..<n).each { if (indeg[it] == 0) pq << it }
def order = []
while (pq) {
    def u = pq.poll()
    order << u
    adj[u].each { v -> if (--indeg[v] == 0) pq << v }
}
println order.join(' ')
