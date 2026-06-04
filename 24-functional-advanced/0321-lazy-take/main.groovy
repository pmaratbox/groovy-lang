def naturals = { ->
    def n = 0
    [next: { -> ++n }]
}

def gen = naturals()
def result = (1..5).collect { gen.next() }
println result.join(' ')
