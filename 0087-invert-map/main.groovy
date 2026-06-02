def m = [a: 1, b: 2, c: 3]
def inverted = m.collectEntries { k, v -> [v, k] }
println inverted.sort { it.key }.collect { k, v -> "$k:$v" }.join(" ")
