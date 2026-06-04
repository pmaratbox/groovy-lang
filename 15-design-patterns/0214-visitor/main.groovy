interface Node { int accept(SumVisitor v) }

class Leaf implements Node {
    int value
    int accept(SumVisitor v) { v.visitLeaf(this) }
}

class Branch implements Node {
    List<Node> children = []
    int accept(SumVisitor v) { v.visitBranch(this) }
}

class SumVisitor {
    int visitLeaf(Leaf leaf) { leaf.value }
    int visitBranch(Branch branch) { branch.children.sum { it.accept(this) } ?: 0 }
}

def tree = new Branch(children: [new Leaf(value: 1), new Leaf(value: 2), new Leaf(value: 3)])
println(tree.accept(new SumVisitor()))
