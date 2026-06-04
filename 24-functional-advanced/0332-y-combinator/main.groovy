// fixed-point combinator (no named self-recursion in factorial)
def fix
fix = { f -> { x -> f(fix(f))(x) } }

def factGen = { self -> { n -> n == 0 ? 1 : n * self(n - 1) } }

def factorial = fix(factGen)
println factorial(5)
