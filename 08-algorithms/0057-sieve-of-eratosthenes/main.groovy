int n = 10
def isPrime = (0..n).collect { true }
isPrime[0] = isPrime[1] = false
for (int i = 2; i * i <= n; i++) {
    if (isPrime[i]) {
        for (int j = i * i; j <= n; j += i) {
            isPrime[j] = false
        }
    }
}

def primes = (2..n).findAll { isPrime[it] }
println primes.join(" ")
