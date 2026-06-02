def merge(left, right) {
    def result = []
    int i = 0, j = 0
    while (i < left.size() && j < right.size()) {
        if (left[i] <= right[j]) result << left[i++]
        else result << right[j++]
    }
    while (i < left.size()) result << left[i++]
    while (j < right.size()) result << right[j++]
    return result
}

def mergeSort(items) {
    if (items.size() <= 1) return items
    int mid = items.size().intdiv(2)
    return merge(mergeSort(items[0..<mid]), mergeSort(items[mid..<items.size()]))
}

def data = [3, 1, 4, 1, 5, 2]
println mergeSort(data).join(" ")
