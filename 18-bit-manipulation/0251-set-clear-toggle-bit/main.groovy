int bit = 1
int s = 0 | (1 << bit)
int c = 2 & ~(1 << bit)
int t = 0 ^ (1 << bit)
println("$s $c $t")
