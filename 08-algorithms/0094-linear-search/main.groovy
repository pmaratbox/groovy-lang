def nums = [4, 2, 7, 1, 9]
int target = 7
int index = nums.findIndexOf { it == target }
println "found ${target} at index ${index}"
