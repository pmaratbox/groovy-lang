def gcd(a, b) { while (b != 0) { (a, b) = [b, a % b] }; a }

def addFractions(n1, d1, n2, d2) {
    int num = n1 * d2 + n2 * d1
    int den = d1 * d2
    int g = gcd(num, den)
    "${(num / g) as int}/${(den / g) as int}"
}

println addFractions(1, 2, 1, 3)
