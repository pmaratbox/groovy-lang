def xs = [2, 4, 6]
def allEven = xs.every { it % 2 == 0 } ? 'yes' : 'no'
def anyOdd = xs.any { it % 2 != 0 } ? 'yes' : 'no'
println "$allEven $anyOdd"
