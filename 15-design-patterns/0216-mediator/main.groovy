class Mediator {
    Colleague b
    void route(String message) { b.receive(message) }
}

class Colleague {
    String name
    Mediator mediator
    void send(String message) { mediator.route(message) }
    void receive(String message) { println("${name} got: ${message}") }
}

def mediator = new Mediator()
def a = new Colleague(name: 'A', mediator: mediator)
def b = new Colleague(name: 'B', mediator: mediator)
mediator.b = b

a.send('hi')
