void siftDown(int[] a, int start, int end) {
    int root = start
    while (2 * root + 1 <= end) {
        int child = 2 * root + 1
        if (child + 1 <= end && a[child] < a[child + 1]) child++
        if (a[root] < a[child]) {
            int t = a[root]; a[root] = a[child]; a[child] = t
            root = child
        } else return
    }
}

def heapSort(int[] a) {
    int n = a.length
    for (int i = n / 2 - 1; i >= 0; i--) siftDown(a, i, n - 1)
    for (int end = n - 1; end > 0; end--) {
        int t = a[0]; a[0] = a[end]; a[end] = t
        siftDown(a, 0, end - 1)
    }
    a
}

int[] data = [5, 3, 8, 1, 4]
println(heapSort(data).join(' '))
