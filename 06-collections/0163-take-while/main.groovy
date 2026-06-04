def xs = [1, 2, 3, 4, 1]
println xs.takeWhile { it < 3 }.join(' ')
