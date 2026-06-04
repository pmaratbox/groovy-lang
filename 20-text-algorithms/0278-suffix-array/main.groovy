def suffixArray(String s) {
    (0..<s.length()).toList().sort { i, j -> s.substring(i) <=> s.substring(j) }
}

println suffixArray("banana").join(" ")
