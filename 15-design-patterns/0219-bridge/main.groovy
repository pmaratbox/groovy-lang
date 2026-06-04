interface Color { String name() }

class Red implements Color { String name() { 'red' } }

abstract class Shape {
    Color color
    abstract String describe()
}

class Circle extends Shape {
    String describe() { "${color.name()} circle" }
}

Shape circle = new Circle(color: new Red())
println(circle.describe())
