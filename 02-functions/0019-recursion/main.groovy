def factorial(int n) {
    n <= 1 ? 1 : n * factorial(n - 1)
}

println "factorial(5) = ${factorial(5)}"
