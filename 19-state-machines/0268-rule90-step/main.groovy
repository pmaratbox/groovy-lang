def row = '00100'.collect { it as int }
def n = row.size()
def next = (0..<n).collect { i ->
    int left = i > 0 ? row[i - 1] : 0
    int right = i < n - 1 ? row[i + 1] : 0
    left ^ right
}
println next.join('')
