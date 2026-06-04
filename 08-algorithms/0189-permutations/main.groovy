def permute
permute = { List<Integer> chosen, List<Integer> rest ->
    if (rest.isEmpty()) {
        println chosen.join(' ')
        return
    }
    for (i in 0..<rest.size()) {
        def remaining = rest[0..<i] + rest[(i + 1)..<rest.size()]
        permute(chosen + rest[i], remaining)
    }
}
permute([], [1, 2, 3])
