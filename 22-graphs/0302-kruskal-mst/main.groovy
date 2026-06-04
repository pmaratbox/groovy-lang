def n = 3
def edges = [[0,1,1],[1,2,2],[0,2,3]]
def parent = (0..<n).toList()

def find
find = { int x -> parent[x] == x ? x : (parent[x] = find(parent[x])) }

def total = 0
edges.sort { it[2] }.each { u, v, w ->
    def ru = find(u), rv = find(v)
    if (ru != rv) {
        parent[ru] = rv
        total += w
    }
}
println total
