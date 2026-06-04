def fact
fact = { n, k ->
    n == 0 ? k(1) : fact(n - 1) { r -> k(n * r) }
}

fact(5) { it -> println it }
