class Animal {
    String speak() {
        "some sound"
    }
}

class Dog extends Animal {
    String speak() {
        "Woof"
    }
}

println "animal: ${new Animal().speak()}"
println "dog: ${new Dog().speak()}"
