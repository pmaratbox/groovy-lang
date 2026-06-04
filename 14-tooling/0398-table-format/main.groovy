def rows = [['a', '1'], ['bb', '22']]
def width = rows.collect { it[0].length() }.max()
rows.each { cells ->
    println "${cells[0].padRight(width)} | ${cells[1]}"
}
