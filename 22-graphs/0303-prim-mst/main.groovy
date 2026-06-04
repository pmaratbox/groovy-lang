import java.util.PriorityQueue

def n = 4
def adj = (0..<n).collect { [:] }
[[0,1,1],[1,2,2],[2,3,3]].each { u, v, w -> adj[u][v] = w; adj[v][u] = w }

def inTree = [false] * n
def pq = new PriorityQueue<List>({ a, b -> a[0] <=> b[0] } as Comparator)
pq << [0, 0]
def total = 0
while (pq) {
    def (w, u) = pq.poll()
    if (inTree[u]) continue
    inTree[u] = true
    total += w
    adj[u].each { v, weight -> if (!inTree[v]) pq << [weight, v] }
}
println total
