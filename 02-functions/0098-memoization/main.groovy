def cache = [:]
def fib
fib = { n ->
    if (n < 2) return n
    if (cache.containsKey(n)) return cache[n]
    cache[n] = fib(n - 1) + fib(n - 2)
    return cache[n]
}

println fib(10)
