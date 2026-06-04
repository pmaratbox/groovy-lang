def isBipartite = { int n, List edges ->
    def adj = (0..<n).collect { [] }
    edges.each { u, v -> adj[u] << v; adj[v] << u }
    def color = [-1] * n
    for (start in 0..<n) {
        if (color[start] != -1) continue
        color[start] = 0
        def queue = [start]
        while (queue) {
            def u = queue.remove(0)
            for (w in adj[u]) {
                if (color[w] == -1) {
                    color[w] = 1 - color[u]
                    queue << w
                } else if (color[w] == color[u]) {
                    return false
                }
            }
        }
    }
    true
}

def cycle4 = isBipartite(4, [[0,1],[1,2],[2,3],[3,0]])
def triangle = isBipartite(3, [[0,1],[1,2],[2,0]])
println "${cycle4 ? 'yes' : 'no'} ${triangle ? 'yes' : 'no'}"
