def catalans(int count) {
    def result = []
    long c = 1
    for (int n = 0; n < count; n++) {
        result << c
        c = (c * 2 * (2 * n + 1)).intdiv(n + 2)
    }
    result
}

println catalans(5).join(' ')
