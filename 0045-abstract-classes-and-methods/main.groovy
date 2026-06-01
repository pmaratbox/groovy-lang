abstract class Shape {
    abstract int area()
    String describe() {
        "area: ${area()}"
    }
}

class Square extends Shape {
    int side
    Square(int side) { this.side = side }
    int area() { side * side }
}

println new Square(3).describe()
