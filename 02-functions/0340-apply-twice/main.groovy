def applyTwice(Closure f, x) {
    f(f(x))
}

def inc = { it + 1 }
println applyTwice(inc, 3)
