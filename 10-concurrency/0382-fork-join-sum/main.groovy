def sumRange
sumRange = { int lo, int hi ->
    if (lo == hi) return lo
    int mid = (lo + hi).intdiv(2)
    int left = 0, right = 0
    def t1 = Thread.start { left = sumRange(lo, mid) }
    def t2 = Thread.start { right = sumRange(mid + 1, hi) }
    t1.join(); t2.join()
    left + right
}
println sumRange(1, 8)
