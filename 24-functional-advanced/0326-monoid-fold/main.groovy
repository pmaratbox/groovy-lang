def fold = { xs, identity, combine -> xs.inject(identity, combine) }

def str = fold(['a', 'b', 'c'], '', { acc, x -> acc + x })
def num = fold([1, 2, 3], 0, { acc, x -> acc + x })

println "${str} ${num}"
