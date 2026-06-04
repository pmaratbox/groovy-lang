def mapOpt = { opt, f -> opt == null ? null : f(opt) }

def some = mapOpt(10) { it + 2 }
def none = mapOpt(null) { it + 2 }

println "${some} ${none ?: 'none'}"
