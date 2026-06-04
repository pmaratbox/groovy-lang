def a = [3, 1, 2, 3, 1]
int max = a.max()
def counts = new int[max + 1]
a.each { counts[it]++ }
def out = []
(0..max).each { v -> counts[v].times { out << v } }
println out.join(' ')
