def rows = 3, cols = 3
def dp = (0..<rows).collect { new int[cols] }
(0..<rows).each { r ->
    (0..<cols).each { c ->
        dp[r][c] = (r == 0 || c == 0) ? 1 : dp[r - 1][c] + dp[r][c - 1]
    }
}
println dp[rows - 1][cols - 1]
