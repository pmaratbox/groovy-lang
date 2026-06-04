def minMax(List<Integer> xs) {
    def lo = xs[0]
    def hi = xs[0]
    for (x in xs) {
        if (x < lo) lo = x
        if (x > hi) hi = x
    }
    [lo, hi]
}

def (lo, hi) = minMax([4, 1, 7])
println "$lo $hi"
