def nums = [1, 5, 11, 5]
def total = nums.sum()
if (total % 2 != 0) {
    println "no"
} else {
    def target = (int) (total / 2)
    def dp = new boolean[target + 1]
    dp[0] = true
    nums.each { x ->
        (target..x).each { s ->
            if (dp[s - x]) dp[s] = true
        }
    }
    println dp[target] ? "yes" : "no"
}
