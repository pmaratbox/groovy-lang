import groovy.transform.Immutable

@Immutable(copyWith = true)
class Point {
    int x
    int y
}

def p1 = new Point(1, 2)
def p2 = p1.copyWith(x: 9)
println "original: (${p1.x}, ${p1.y})"
println "updated: (${p2.x}, ${p2.y})"
