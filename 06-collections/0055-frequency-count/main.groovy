def word = "banana"
def counts = word.toList().countBy { it }

def out = counts.keySet().sort().collect { ch -> "${ch}:${counts[ch]}" }
println out.join(" ")
