int n = 19
def seen = [] as Set
while (n != 1 && !seen.contains(n)) {
    seen << n
    n = ("" + n).collect { int d = it as int; d * d }.sum()
}
println n == 1 ? 'yes' : 'no'
