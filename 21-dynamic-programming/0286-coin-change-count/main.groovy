def coins = [1, 2, 5]
def target = 5
def dp = new int[target + 1]
dp[0] = 1
coins.each { c ->
    (c..target).each { amt ->
        dp[amt] += dp[amt - c]
    }
}
println dp[target]
