def nums = [3, 1, 2]
def asc = nums.sort(false)
def desc = nums.sort(false) { a, b -> b <=> a }
println "asc: ${asc.join(' ')}"
println "desc: ${desc.join(' ')}"
