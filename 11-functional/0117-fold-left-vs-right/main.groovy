def xs = [1, 2, 3]

def left = xs.inject(0) { acc, x -> acc - x }
def right = xs.reverse().inject(0) { acc, x -> x - acc }

println "${left} ${right}"
