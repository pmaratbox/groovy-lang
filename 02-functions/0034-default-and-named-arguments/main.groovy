def greet(String name, String greeting = "Hello") {
    "${greeting}, ${name}"
}

println greet("Ada")
println greet("Ada", "Hi")
