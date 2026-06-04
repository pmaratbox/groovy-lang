def items = [[2, 3], [3, 4], [4, 5]]
def cap = 5
def dp = new int[cap + 1]
items.each { item ->
    def (w, v) = item
    (cap..w).each { c ->
        dp[c] = Math.max(dp[c], dp[c - w] + v)
    }
}
println dp[cap]
