def strategies = [
    add: { int a, int b -> a + b },
    mul: { int a, int b -> a * b },
]

def selected = ['add', 'mul'].collect { strategies[it](3, 4) }
println(selected.join(' '))
