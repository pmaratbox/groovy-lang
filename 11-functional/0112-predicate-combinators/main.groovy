def isEven = { n -> n % 2 == 0 }
def isPositive = { n -> n > 0 }
def and = { p, q -> { x -> p(x) && q(x) } }

def evenAndPos = and(isEven, isPositive)

println "${evenAndPos(4) ? 'yes' : 'no'} ${evenAndPos(-4) ? 'yes' : 'no'}"
