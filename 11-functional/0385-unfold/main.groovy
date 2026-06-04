def terms = []
def x = 1
5.times {
    terms << x
    x *= 2
}

println terms.join(' ')
