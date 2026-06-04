def a = [1, 2, 3]
def b = [4, 5, 6]

def zipped = [a, b].transpose().collect { x, y -> x + y }

println zipped.join(' ')
