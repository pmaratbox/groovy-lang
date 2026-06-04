def naturals = { ->
    def n = 0
    [next: { -> ++n }]
}

def gen = naturals()
def evens = { -> def v; while (((v = gen.next()) % 2) != 0) {}; v }

def result = (1..3).collect { evens() }
println result.join(' ')
