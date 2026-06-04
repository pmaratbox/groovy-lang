int x = 1
int r = 0
(0..<8).each { i ->
    r = (r << 1) | ((x >> i) & 1)
}
println(r)
