def isPrime = { int n ->
    if (n < 2) return false
    for (int i = 2; (long) i * i <= n; i++) {
        if (n % i == 0) return false
    }
    true
}
println "${isPrime(7) ? 'yes' : 'no'} ${isPrime(9) ? 'yes' : 'no'}"
