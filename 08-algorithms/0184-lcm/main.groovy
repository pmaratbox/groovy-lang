def gcd
gcd = { int a, int b -> b == 0 ? a : gcd(b, a % b) }
int a = 4, b = 6
println(((int) (a / gcd(a, b))) * b)
