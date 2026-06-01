def upper = "a,b,c".split(",").collect { it.toUpperCase() }
println upper.join("-")
