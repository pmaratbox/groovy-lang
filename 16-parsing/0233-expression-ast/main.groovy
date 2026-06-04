abstract class Node {
    abstract int eval()
}

class Num extends Node {
    int value
    Num(int v) { value = v }
    int eval() { value }
}

class BinOp extends Node {
    String op
    Node left, right
    BinOp(String op, Node l, Node r) { this.op = op; left = l; right = r }
    int eval() {
        switch (op) {
            case "+": return left.eval() + right.eval()
            case "*": return left.eval() * right.eval()
        }
    }
}

def ast = new BinOp("+", new Num(1), new BinOp("*", new Num(2), new Num(3)))
println ast.eval()
