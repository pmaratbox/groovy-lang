class Point {
    int x
    int y

    String toString() { "Point(${x}, ${y})" }
}

println new Point(x: 1, y: 2)
