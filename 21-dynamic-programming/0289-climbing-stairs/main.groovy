def n = 5
def dp = new int[n + 1]
dp[0] = 1
dp[1] = 1
(2..n).each { i ->
    dp[i] = dp[i - 1] + dp[i - 2]
}
println dp[n]
