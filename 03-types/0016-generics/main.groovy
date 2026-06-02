def <T> T first(List<T> items) {
    items[0]
}

def ints = [1, 2, 3]
def strs = ["a", "b", "c"]

println "first int: ${first(ints)}"
println "first string: ${first(strs)}"
