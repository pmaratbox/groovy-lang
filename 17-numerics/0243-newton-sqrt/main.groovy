def newtonSqrt(double n) {
    double x = n
    while (true) {
        double next = x - (x * x - n) / (2 * x)
        if (Math.abs(next - x) < 1e-12) break
        x = next
    }
    x
}

println String.format('%.4f', newtonSqrt(2.0))
