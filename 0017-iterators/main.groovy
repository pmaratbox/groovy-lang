def nums = [1, 2, 3, 4, 5]

def result = nums.findAll { it % 2 == 0 }.collect { it * 2 }.sum()

println "sum: ${result}"
