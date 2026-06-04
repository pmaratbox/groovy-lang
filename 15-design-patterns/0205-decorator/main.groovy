interface Coffee { int cost() }

class BaseCoffee implements Coffee { int cost() { 2 } }

abstract class CoffeeDecorator implements Coffee {
    Coffee inner
    CoffeeDecorator(Coffee inner) { this.inner = inner }
}

class Milk extends CoffeeDecorator {
    Milk(Coffee inner) { super(inner) }
    int cost() { inner.cost() + 1 }
}

class Sugar extends CoffeeDecorator {
    Sugar(Coffee inner) { super(inner) }
    int cost() { inner.cost() + 1 }
}

Coffee coffee = new Sugar(new Milk(new BaseCoffee()))
println(coffee.cost())
