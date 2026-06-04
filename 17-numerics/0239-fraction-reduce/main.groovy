def gcd(a, b) { while (b != 0) { (a, b) = [b, a % b] }; a }

def reduce(num, den) {
    int g = gcd(num, den)
    "${(num / g) as int}/${(den / g) as int}"
}

println reduce(6, 8)
