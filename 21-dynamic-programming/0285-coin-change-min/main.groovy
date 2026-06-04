def coins = [1, 2, 5]
def target = 11
def INF = target + 1
def dp = (0..target).collect { it == 0 ? 0 : INF }
(1..target).each { amt ->
    coins.findAll { it <= amt }.each { c ->
        dp[amt] = Math.min(dp[amt], dp[amt - c] + 1)
    }
}
println dp[target]
