def reverse(List xs) {
    xs.isEmpty() ? [] : reverse(xs.tail()) + [xs.head()]
}

println reverse([1, 2, 3]).join(' ')
