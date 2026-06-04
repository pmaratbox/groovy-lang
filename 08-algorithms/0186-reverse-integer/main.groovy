int n = 1234
int rev = 0
while (n > 0) {
    rev = rev * 10 + (n % 10)
    n = (int) (n / 10)
}
println rev
