def isPerfect(int n) {
    (1..<n).findAll { n % it == 0 }.sum() == n
}

def label = { isPerfect(it) ? 'yes' : 'no' }
println "${label(6)} ${label(8)}"
