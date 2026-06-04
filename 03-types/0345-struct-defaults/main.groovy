import groovy.transform.Canonical

@Canonical
class Point {
    int x = 0
    int y = 0
}

def a = new Point()
def b = new Point(x: 5)

println "${a.x} ${a.y}"
println "${b.x} ${b.y}"
