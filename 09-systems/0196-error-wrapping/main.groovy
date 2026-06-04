def inner = new RuntimeException("inner")
def outer = new RuntimeException("outer", inner)
println "${outer.message}: ${outer.cause.message}"
