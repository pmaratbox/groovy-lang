def n = 3
def INF = 1000000
def dist = (0..<n).collect { i -> (0..<n).collect { j -> i == j ? 0 : INF } }
[[0,1,3],[1,2,1],[0,2,5]].each { u, v, w -> dist[u][v] = w }

for (k in 0..<n)
    for (i in 0..<n)
        for (j in 0..<n)
            if (dist[i][k] + dist[k][j] < dist[i][j])
                dist[i][j] = dist[i][k] + dist[k][j]

println dist[0][2]
