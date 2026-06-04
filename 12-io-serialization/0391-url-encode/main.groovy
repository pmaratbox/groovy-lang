def input = "a b&c"
def unreserved = { char c ->
    c.isLetterOrDigit() || c in ['-', '_', '.', '~']
}
def encoded = input.collect { ch ->
    def c = ch as char
    unreserved(c) ? ch : "%" + String.format("%02X", (int) c)
}.join()
println encoded
