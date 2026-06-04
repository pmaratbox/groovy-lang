def grid = [[1, 3, 1], [1, 5, 1], [4, 2, 1]]
def rows = grid.size(), cols = grid[0].size()
def dp = (0..<rows).collect { new int[cols] }
(0..<rows).each { r ->
    (0..<cols).each { c ->
        def best = grid[r][c]
        if (r == 0 && c == 0) {
            // start
        } else if (r == 0) {
            best += dp[r][c - 1]
        } else if (c == 0) {
            best += dp[r - 1][c]
        } else {
            best += Math.min(dp[r - 1][c], dp[r][c - 1])
        }
        dp[r][c] = best
    }
}
println dp[rows - 1][cols - 1]
