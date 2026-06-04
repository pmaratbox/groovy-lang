def text = "[1,2,3]"
def inner = text[1..-2]
def sum = inner.split(",").collect { it.trim() as int }.sum()
println sum
