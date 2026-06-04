def groups = ["eat", "tea", "tan", "ate", "nat"].groupBy { it.toList().sort().join() }
println groups.size()
