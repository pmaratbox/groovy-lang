int mask = 5
def subs = []
int sub = mask
while (true) {
    subs << sub
    if (sub == 0) break
    sub = (sub - 1) & mask
}
println(subs.join(' '))
