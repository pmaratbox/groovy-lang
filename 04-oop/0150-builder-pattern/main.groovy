class Pizza {
    String size
    List<String> toppings

    String toString() { "Pizza(${size}, ${toppings.join(', ')})" }
}

class PizzaBuilder {
    private String size
    private List<String> toppings = []

    PizzaBuilder setSize(String s) { size = s; this }

    PizzaBuilder addTopping(String t) { toppings << t; this }

    Pizza build() { new Pizza(size: size, toppings: toppings) }
}

def pizza = new PizzaBuilder().setSize("M").addTopping("cheese").build()
println pizza
