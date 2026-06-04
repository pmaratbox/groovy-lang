def a = [5, 1, 4, 2, 8]
for (i in 0..<a.size()) {
    for (j in 0..<(a.size() - 1 - i)) {
        if (a[j] > a[j + 1]) {
            def t = a[j]; a[j] = a[j + 1]; a[j + 1] = t
        }
    }
}
println a.join(' ')
