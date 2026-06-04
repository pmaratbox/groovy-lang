def a = [2, 2, 1, 2, 3, 2]
def candidate = null
int count = 0
for (x in a) {
    if (count == 0) candidate = x
    count += (x == candidate) ? 1 : -1
}
println candidate
