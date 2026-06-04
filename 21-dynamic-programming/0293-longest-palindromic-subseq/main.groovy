def s = "bbbab"
def n = s.size()
def dp = (0..<n).collect { new int[n] }
(0..<n).each { i -> dp[i][i] = 1 }
(2..n).each { len ->
    (0..(n - len)).each { i ->
        def j = i + len - 1
        if (s[i] == s[j]) {
            dp[i][j] = (len == 2) ? 2 : dp[i + 1][j - 1] + 2
        } else {
            dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1])
        }
    }
}
println dp[0][n - 1]
