def fastPow(long base, long exp) {
    long result = 1
    while (exp > 0) {
        if ((exp & 1) == 1) result *= base
        base *= base
        exp >>= 1
    }
    result
}

println fastPow(2, 10)
