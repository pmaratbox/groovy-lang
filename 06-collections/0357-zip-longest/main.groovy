def a = [1, 2, 3]
def b = ["a", "b"]
def n = Math.max(a.size(), b.size())
def out = (0..<n).collect { i ->
    def x = i < a.size() ? a[i] : "-"
    def y = i < b.size() ? b[i] : "-"
    "$x$y"
}
println out.join(" ")
