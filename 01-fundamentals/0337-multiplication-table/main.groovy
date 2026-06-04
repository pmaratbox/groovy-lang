(1..3).each { i ->
    def row = (1..3).collect { j -> i * j }.join(' ')
    println row
}
