def n = 4
def adj = (0..<n).collect { [] }
def radj = (0..<n).collect { [] }
[[0,1],[1,2],[2,0],[2,3]].each { u, v -> adj[u] << v; radj[v] << u }

def visited = [false] * n
def order = []
def dfs1
dfs1 = { int u ->
    visited[u] = true
    adj[u].each { v -> if (!visited[v]) dfs1(v) }
    order << u
}
(0..<n).each { if (!visited[it]) dfs1(it) }

def comp = [-1] * n
def dfs2
dfs2 = { int u, int c ->
    comp[u] = c
    radj[u].each { v -> if (comp[v] == -1) dfs2(v, c) }
}
def count = 0
order.reverse().each { u -> if (comp[u] == -1) dfs2(u, count++) }
println count
