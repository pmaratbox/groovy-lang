def extgcd(a, b) {
    if (b == 0) return [a, 1, 0]
    def (g, x1, y1) = extgcd(b, a % b)
    [g, y1, x1 - (a.intdiv(b)) * y1]
}

def (g, x, y) = extgcd(30, 12)
println "$g $x $y"
