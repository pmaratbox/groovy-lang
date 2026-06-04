interface Greeter {
    default String greet() { 'hi' }
}

class Polite implements Greeter {
}

class Casual implements Greeter {
    String greet() { 'hey' }
}

println "${new Polite().greet()} ${new Casual().greet()}"
