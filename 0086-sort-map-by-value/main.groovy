def scores = [a: 3, b: 1, c: 2]
println scores.sort { it.value }.collect { k, v -> "$k:$v" }.join(" ")
