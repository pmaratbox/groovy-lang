def gcd(a, b) {
    while (b != 0) {
        (a, b) = [b, a % b]
    }
    return a
}

println gcd(48, 36)
