def expr = "3 4 + 5 *"
def stack = []
for (tok in expr.split(" ")) {
    if (tok in ["+", "-", "*", "/"]) {
        def b = stack.removeLast()
        def a = stack.removeLast()
        switch (tok) {
            case "+": stack << a + b; break
            case "-": stack << a - b; break
            case "*": stack << a * b; break
            case "/": stack << a.intdiv(b); break
        }
    } else {
        stack << (tok as int)
    }
}
println stack.removeLast()
