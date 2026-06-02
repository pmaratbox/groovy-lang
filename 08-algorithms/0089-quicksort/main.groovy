def quicksort(items) {
    if (items.size() <= 1) return items
    def pivot = items[0]
    def rest = items.drop(1)
    def less = rest.findAll { it < pivot }
    def greater = rest.findAll { it >= pivot }
    return quicksort(less) + [pivot] + quicksort(greater)
}

println quicksort([3, 1, 4, 1, 5, 2]).join(" ")
