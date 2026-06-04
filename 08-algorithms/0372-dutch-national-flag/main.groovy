def a = [2, 0, 2, 1, 1, 0]
int low = 0, mid = 0, high = a.size() - 1
while (mid <= high) {
    if (a[mid] == 0) {
        def t = a[low]; a[low] = a[mid]; a[mid] = t
        low++; mid++
    } else if (a[mid] == 1) {
        mid++
    } else {
        def t = a[mid]; a[mid] = a[high]; a[high] = t
        high--
    }
}
println a.join(' ')
