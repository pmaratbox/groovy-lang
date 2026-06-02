[["listen", "silent"], ["hello", "world"]].each { pair ->
    def (a, b) = pair
    def ana = a.toList().sort() == b.toList().sort()
    println "${a}/${b}: ${ana ? 'yes' : 'no'}"
}
