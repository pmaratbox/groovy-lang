class Address {
    String city
}

class Person {
    String name
    Address address
}

def person = new Person(name: "Ada", address: new Address(city: "London"))
println person.address.city
