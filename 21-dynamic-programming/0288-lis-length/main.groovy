def nums = [10, 9, 2, 5, 3, 7, 101, 18]
def dp = nums.collect { 1 }
nums.eachWithIndex { x, i ->
    (0..<i).each { j ->
        if (nums[j] < x) dp[i] = Math.max(dp[i], dp[j] + 1)
    }
}
println dp.max()
