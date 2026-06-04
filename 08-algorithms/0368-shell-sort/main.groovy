def a = [5, 2, 8, 1, 9, 3]
int n = a.size()
for (int gap = n.intdiv(2); gap > 0; gap = gap.intdiv(2)) {
    for (int i = gap; i < n; i++) {
        def tmp = a[i]
        int j = i
        while (j >= gap && a[j - gap] > tmp) {
            a[j] = a[j - gap]
            j -= gap
        }
        a[j] = tmp
    }
}
println a.join(' ')
