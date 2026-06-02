def inc = { x -> x + 1 }
def dbl = { x -> x * 2 }

def apply(Closure f, int x) {
    f(x)
}

println "inc 5 = ${apply(inc, 5)}"
println "double 5 = ${apply(dbl, 5)}"
