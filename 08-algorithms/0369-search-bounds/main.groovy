def a = [1, 3, 5, 5, 7]

def lowerBound = { list, target ->
    int lo = 0, hi = list.size()
    while (lo < hi) {
        int mid = (lo + hi).intdiv(2)
        if (list[mid] < target) lo = mid + 1 else hi = mid
    }
    lo
}

def upperBound = { list, target ->
    int lo = 0, hi = list.size()
    while (lo < hi) {
        int mid = (lo + hi).intdiv(2)
        if (list[mid] <= target) lo = mid + 1 else hi = mid
    }
    lo
}

println "${lowerBound(a, 5)} ${upperBound(a, 5)}"
