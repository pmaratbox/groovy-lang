def n = 3
def adj = (0..<n).collect { [] }
[[0,1],[1,2],[2,0]].each { u, v -> adj[u] << v }

def color = [0] * n  // 0=white, 1=gray, 2=black
def hasCycle
hasCycle = { int u ->
    color[u] = 1
    for (v in adj[u]) {
        if (color[v] == 1) return true
        if (color[v] == 0 && hasCycle(v)) return true
    }
    color[u] = 2
    false
}

def found = (0..<n).any { color[it] == 0 && hasCycle(it) }
println found ? 'cycle' : 'acyclic'
