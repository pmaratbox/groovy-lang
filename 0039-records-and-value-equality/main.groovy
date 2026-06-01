record Point(int x, int y) {}

def p1 = new Point(1, 2)
def p2 = new Point(1, 2)
println "point: (${p1.x}, ${p1.y})"
println "equal: ${p1 == p2 ? 'yes' : 'no'}"
