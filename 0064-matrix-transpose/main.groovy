def matrix = [[1, 2, 3], [4, 5, 6]]

matrix.transpose().each { row ->
    println row.join(" ")
}
