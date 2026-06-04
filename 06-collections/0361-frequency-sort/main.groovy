def xs = [1, 1, 2, 3, 3, 3]
def counts = xs.countBy { it }
def order = xs.unique(false)
def sorted = order.sort(false) { -counts[it] }
def out = sorted.collectMany { v -> [v] * counts[v] }
println out.join(" ")
