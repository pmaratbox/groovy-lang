interface Shape {
    double area()
}

class Rectangle implements Shape {
    double w, h
    double area() { w * h }
}

class Triangle implements Shape {
    double base, height
    double area() { base * height / 2 }
}

List<Shape> shapes = [new Rectangle(w: 2, h: 3), new Triangle(base: 4, height: 4)]
def total = shapes.sum { it.area() } as int
println "total area: ${total}"
