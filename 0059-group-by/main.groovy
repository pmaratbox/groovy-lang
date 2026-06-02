def words = ["one", "two", "three"]
def groups = words.groupBy { it.length() }

def out = groups.keySet().sort().collect { k -> "${k}:[${groups[k].join(',')}]" }
println out.join(" ")
