interface Shape {
    String name()
    int area()
}

class Rectangle implements Shape {
    int width
    int height
    String name() { "rectangle" }
    int area() { width * height }
}

class Square implements Shape {
    int side
    String name() { "square" }
    int area() { side * side }
}

List<Shape> shapes = [new Rectangle(width: 3, height: 4), new Square(side: 5)]
for (s in shapes) {
    println "${s.name()} area: ${s.area()}"
}
