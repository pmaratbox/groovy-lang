interface Component { int size() }

class Leaf implements Component {
    int value
    int size() { value }
}

class Composite implements Component {
    List<Component> children = []
    Composite add(Component c) { children << c; this }
    int size() { children.sum { it.size() } ?: 0 }
}

def tree = new Composite()
    .add(new Leaf(value: 1))
    .add(new Leaf(value: 2))
    .add(new Leaf(value: 3))

println(tree.size())
