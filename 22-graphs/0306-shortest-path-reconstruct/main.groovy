import java.util.PriorityQueue

def n = 4
def adj = (0..<n).collect { [:] }
[[0,1,4],[0,2,1],[2,1,2],[1,3,1],[2,3,5]].each { u, v, w -> adj[u][v] = w }

def dist = [Integer.MAX_VALUE] * n
def prev = [-1] * n
dist[0] = 0
def pq = new PriorityQueue<List>({ a, b -> a[0] <=> b[0] } as Comparator)
pq << [0, 0]
while (pq) {
    def (d, u) = pq.poll()
    if (d > dist[u]) continue
    adj[u].each { v, w ->
        if (dist[u] + w < dist[v]) {
            dist[v] = dist[u] + w
            prev[v] = u
            pq << [dist[v], v]
        }
    }
}

def path = []
for (cur = 3; cur != -1; cur = prev[cur]) path << cur
println path.reverse().join(' ')
