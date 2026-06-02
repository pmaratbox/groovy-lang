def a = 0, b = 1
def nums = []
7.times {
    nums << a
    (a, b) = [b, a + b]
}
println nums.join(" ")
