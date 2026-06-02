def inc = { it + 1 }
def twice = { it * 2 }
def compose = { f, g -> { x -> f(g(x)) } }

println compose(inc, twice)(3)
