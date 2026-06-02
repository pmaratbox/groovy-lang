int n = 1234
int total = 0
while (n > 0) {
    total += n % 10
    n = n.intdiv(10)
}
println total
