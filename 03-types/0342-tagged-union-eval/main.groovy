abstract class Expr {}

class Num extends Expr {
    int value
    Num(int v) { value = v }
}

class Add extends Expr {
    Expr left
    Expr right
    Add(Expr l, Expr r) { left = l; right = r }
}

int eval(Expr e) {
    switch (e) {
        case Num: return e.value
        case Add: return eval(e.left) + eval(e.right)
    }
}

println eval(new Add(new Num(1), new Num(2)))
