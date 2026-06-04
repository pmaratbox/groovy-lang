def grid = [
    [0, 1, 0],
    [0, 1, 0],
    [0, 1, 0],
]

def liveNeighbors = { r, c ->
    int count = 0
    for (dr in -1..1) {
        for (dc in -1..1) {
            if (dr == 0 && dc == 0) continue
            int nr = r + dr
            int nc = c + dc
            if (nr in 0..2 && nc in 0..2) count += grid[nr][nc]
        }
    }
    count
}

def next = (0..2).collect { r ->
    (0..2).collect { c ->
        int n = liveNeighbors(r, c)
        grid[r][c] == 1 ? ((n == 2 || n == 3) ? 1 : 0) : (n == 3 ? 1 : 0)
    }
}

next.each { row ->
    println row.collect { it == 1 ? '#' : '.' }.join('')
}
