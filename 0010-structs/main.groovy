class Person {
    String name
    int age
}

def person = new Person(name: "Ada", age: 36)

println "name: ${person.name}"
println "age: ${person.age}"
