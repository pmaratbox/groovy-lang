def dims = [10, 20, 30, 40]
def n = dims.size() - 1
def dp = (0..<n).collect { new int[n] }
(2..n).each { len ->
    (0..(n - len)).each { i ->
        def j = i + len - 1
        dp[i][j] = Integer.MAX_VALUE
        (i..<j).each { k ->
            def cost = dp[i][k] + dp[k + 1][j] + dims[i] * dims[k + 1] * dims[j + 1]
            dp[i][j] = Math.min(dp[i][j], cost)
        }
    }
}
println dp[0][n - 1]
