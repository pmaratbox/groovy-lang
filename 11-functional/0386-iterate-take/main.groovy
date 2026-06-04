def f = { it * 3 }

def vals = []
def x = 1
4.times {
    vals << x
    x = f(x)
}

println vals.join(' ')
