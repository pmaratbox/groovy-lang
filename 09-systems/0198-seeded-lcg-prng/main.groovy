int x = 1
def out = (1..3).collect { x = (5 * x + 3) % 16 }
println out.join(' ')
