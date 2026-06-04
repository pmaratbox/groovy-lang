def modpow(base, exp, mod) {
    long result = 1
    long b = base % mod
    long e = exp
    while (e > 0) {
        if ((e & 1) == 1) result = (result * b) % mod
        b = (b * b) % mod
        e >>= 1
    }
    result
}

println modpow(3, 13, 7)
