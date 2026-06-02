class Point {
    int x, y

    Point plus(Point other) {
        new Point(x: x + other.x, y: y + other.y)
    }

    String toString() {
        "($x, $y)"
    }
}

println(new Point(x: 1, y: 2) + new Point(x: 3, y: 4))
