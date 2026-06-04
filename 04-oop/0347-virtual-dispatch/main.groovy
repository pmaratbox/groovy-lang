abstract class Shape {
    abstract String describe()
}

class Circle extends Shape {
    String describe() { 'circle' }
}

class Square extends Shape {
    String describe() { 'square' }
}

class Triangle extends Shape {
    String describe() { 'triangle' }
}

List<Shape> shapes = [new Circle(), new Square(), new Triangle()]
println shapes.collect { it.describe() }.join(' ')
