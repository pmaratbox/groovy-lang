def row = [1]
4.times {
    println row.join(' ')
    def next = [1]
    for (i in 0..<(row.size() - 1)) {
        next << row[i] + row[i + 1]
    }
    next << 1
    row = next
}
