def matVec(m, v) {
    m.collect { row -> [row, v].transpose().collect { a, b -> a * b }.sum() }
}

def result = matVec([[1, 2], [3, 4]], [5, 6])
println result.join(' ')
