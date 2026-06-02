def a = [1, 2, 3] as Set
def b = [2, 3, 4] as Set
println((a + b).sort().join(" "))
println(a.intersect(b).sort().join(" "))
