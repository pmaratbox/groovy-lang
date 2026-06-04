int n = 13
int count = 0
while (n != 0) {
    n &= (n - 1)
    count++
}
println count
