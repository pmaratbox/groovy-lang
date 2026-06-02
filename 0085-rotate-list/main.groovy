def nums = [1, 2, 3, 4, 5]
int k = 2
def rotated = nums[k..<nums.size()] + nums[0..<k]
println rotated.join(" ")
