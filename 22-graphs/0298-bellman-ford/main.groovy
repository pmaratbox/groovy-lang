def n = 3
def edges = [[0,1,1],[1,2,-2],[0,2,4]]
def dist = [Integer.MAX_VALUE] * n
dist[0] = 0
(n - 1).times {
    edges.each { u, v, w ->
        if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
            dist[v] = dist[u] + w
        }
    }
}
println dist.join(' ')
