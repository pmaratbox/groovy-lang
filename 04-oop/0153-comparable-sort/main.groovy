class Person implements Comparable<Person> {
    String name
    int age

    int compareTo(Person other) { age <=> other.age }
}

def people = [new Person(name: "alice", age: 30), new Person(name: "bob", age: 25)]
println people.sort(false).collect { it.name }.join(' ')
