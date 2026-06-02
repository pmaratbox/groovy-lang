def text = "hello world"
println text.split(" ").collect { it.capitalize() }.join(" ")
