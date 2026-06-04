def xs = [1, 1, 2, 3, 3, 3]

def runs = []
for (x in xs) {
    if (runs && runs[-1][-1] == x) {
        runs[-1] << x
    } else {
        runs << [x]
    }
}

println runs.collect { it.join(' ') }.join('|')
