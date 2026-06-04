def a = [5, 1, 4, 2]
for (int i = 0; i < a.size() - 1; i++) {
    int min = i
    for (int j = i + 1; j < a.size(); j++) {
        if (a[j] < a[min]) min = j
    }
    if (min != i) {
        def t = a[i]; a[i] = a[min]; a[min] = t
    }
}
println a.join(' ')
