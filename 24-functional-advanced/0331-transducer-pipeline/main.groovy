// transducers: a step is reducer -> reducer
def mapping = { f -> { rf -> { acc, x -> rf(acc, f(x)) } } }
def filtering = { p -> { rf -> { acc, x -> p(x) ? rf(acc, x) : acc } } }

def xform = filtering { it % 2 == 0 } >> mapping { it + 1 }

def append = { acc, x -> acc << x }
def result = [1, 2, 3, 4].inject([], xform(append))

println result.join(' ')
