def nums = [3, 34, 4, 12, 5, 2]
def target = 9
def dp = new boolean[target + 1]
dp[0] = true
nums.findAll { it <= target }.each { x ->
    (target..x).each { s ->
        if (dp[s - x]) dp[s] = true
    }
}
println dp[target] ? "yes" : "no"
