class UnionFind {
    int[] parent
    UnionFind(int n) { parent = (0..<n) as int[] }
    int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x])
        parent[x]
    }
    void union(int a, int b) { parent[find(a)] = find(b) }
    boolean connected(int a, int b) { find(a) == find(b) }
}

def uf = new UnionFind(4)
uf.union(0, 1)
uf.union(2, 3)
println([uf.connected(0, 1) ? "yes" : "no", uf.connected(0, 2) ? "yes" : "no"].join(' '))
