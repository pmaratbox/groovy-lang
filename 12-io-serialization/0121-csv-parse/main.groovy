def rows = ["alice,30", "bob,25"]
def pairs = rows.collect { row ->
    def (name, value) = row.split(',')
    "${name}=${value}"
}
println pairs.join(' ')
