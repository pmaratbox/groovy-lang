def left = [a: 1, b: 2]
def right = [b: 3, c: 4]
def merged = left + right
println merged.sort { it.key }.collect { k, v -> "$k:$v" }.join(' ')
