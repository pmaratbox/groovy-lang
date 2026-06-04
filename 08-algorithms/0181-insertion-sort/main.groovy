def a = [5, 1, 4, 2, 8]
for (i in 1..<a.size()) {
    def key = a[i]
    int j = i - 1
    while (j >= 0 && a[j] > key) {
        a[j + 1] = a[j]
        j--
    }
    a[j + 1] = key
}
println a.join(' ')
