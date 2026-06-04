def horner(coeffs, x) {
    coeffs.inject(0) { acc, c -> acc * x + c }
}

println horner([2, 3, 1], 2)
