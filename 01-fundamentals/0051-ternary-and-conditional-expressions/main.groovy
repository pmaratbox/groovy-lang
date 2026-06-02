[4, 7].each { n ->
    def label = n % 2 == 0 ? "even" : "odd"
    println "${n}: ${label}"
}
