def adj = [
    0: [1, 2],
    1: [0, 3],
    2: [0, 3],
    3: [1, 2],
]

def visited = [] as Set
def order = []
def dfs
dfs = { int node ->
    visited << node
    order << node
    adj[node].each { n ->
        if (!visited.contains(n)) dfs(n)
    }
}
dfs(0)
println order.join(' ')
