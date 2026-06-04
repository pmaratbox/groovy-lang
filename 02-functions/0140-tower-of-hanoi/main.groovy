def moves(int n) {
    n == 0 ? 0 : 2 * moves(n - 1) + 1
}

println moves(3)
