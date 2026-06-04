def sum(List<Integer> xs) {
    xs.isEmpty() ? 0 : xs.head() + sum(xs.tail())
}

println sum([1, 2, 3, 4])
