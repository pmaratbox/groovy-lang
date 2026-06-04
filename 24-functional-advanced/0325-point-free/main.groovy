def square = { it * it }
def sum = { xs -> xs.sum() }
def mapWith = { f -> { xs -> xs.collect(f) } }

def sumOfSquares = mapWith(square) >> sum

println sumOfSquares([1, 2, 3])
