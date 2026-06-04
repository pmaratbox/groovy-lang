def binomial(int n, int k) {
    if (k > n - k) k = n - k
    long result = 1
    for (int i = 0; i < k; i++) {
        result = (result * (n - i)).intdiv(i + 1)
    }
    result
}

println binomial(5, 2)
