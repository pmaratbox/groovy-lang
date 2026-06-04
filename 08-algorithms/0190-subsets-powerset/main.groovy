def elems = [1, 2, 3]
for (mask in 0..<(1 << elems.size())) {
    def subset = []
    for (i in 0..<elems.size()) {
        if (mask & (1 << i)) subset << elems[i]
    }
    println subset ? subset.join(' ') : '{}'
}
