def word(int n) {
    switch (n) {
        case 1: return "one"
        case 2: return "two"
        default: return "many"
    }
}

[1, 2, 5].each { n ->
    println "${n}: ${word(n)}"
}
