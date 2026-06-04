def n = 5
def adj = (0..<n).collect { [] }
[[0,1],[1,2],[3,4]].each { u, v -> adj[u] << v; adj[v] << u }

def seen = [false] * n
def count = 0
(0..<n).each { start ->
    if (!seen[start]) {
        count++
        def stack = [start]
        while (stack) {
            def u = stack.pop()
            if (seen[u]) continue
            seen[u] = true
            adj[u].each { v -> if (!seen[v]) stack << v }
        }
    }
}
println count
