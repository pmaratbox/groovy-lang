def nums = [1, 2, 3, 4]
int total = 0
def sums = nums.collect { total += it }
println sums.join(" ")
