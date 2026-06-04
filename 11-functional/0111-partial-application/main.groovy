def add = { a, b -> a + b }
def add10 = add.curry(10)

println add10(3)
