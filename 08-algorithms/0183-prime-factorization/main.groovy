int n = 60
def factors = []
while (n % 2 == 0) { factors << 2; n = (int) (n / 2) }
for (int f = 3; (long) f * f <= n; f += 2) {
    while (n % f == 0) { factors << f; n = (int) (n / f) }
}
if (n > 1) factors << n
println factors.join(' ')
