def minMax(int a, int b) {
    [Math.min(a, b), Math.max(a, b)]
}

def (lo, hi) = minMax(3, 7)
println "min: ${lo}"
println "max: ${hi}"
