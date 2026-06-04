def a = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
int cur = a[0], best = a[0]
for (x in a[1..-1]) {
    cur = Math.max(cur + x, x)
    best = Math.max(best, cur)
}
println best
