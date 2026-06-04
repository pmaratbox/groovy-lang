def xs = [1, 2, 3, 4]
def pairs = (0..<xs.size() - 1).collect { i -> "${xs[i]},${xs[i + 1]}" }
println pairs.join(" ")
