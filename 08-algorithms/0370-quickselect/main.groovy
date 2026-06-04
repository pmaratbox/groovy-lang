def swap = { list, i, j -> def t = list[i]; list[i] = list[j]; list[j] = t }

def partition
partition = { list, lo, hi ->
    def pivot = list[hi]
    int i = lo
    for (int j = lo; j < hi; j++) {
        if (list[j] < pivot) { swap(list, i, j); i++ }
    }
    swap(list, i, hi)
    i
}

def quickselect
quickselect = { list, lo, hi, k ->
    int p = partition(list, lo, hi)
    if (p == k) return list[p]
    if (k < p) return quickselect(list, lo, p - 1, k)
    return quickselect(list, p + 1, hi, k)
}

def a = [7, 10, 4, 3, 20, 15]
println quickselect(a, 0, a.size() - 1, 2)
