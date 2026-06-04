def countdown(int n, List acc) {
    if (n == 0) return acc
    acc << n
    countdown(n - 1, acc)
}

println countdown(5, []).join(' ')
