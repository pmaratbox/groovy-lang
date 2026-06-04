interface Observer { void update(int value) }

class PrintObserver implements Observer {
    String id
    void update(int value) { println("${id}: ${value}") }
}

class Subject {
    List<Observer> observers = []
    void register(Observer o) { observers << o }
    void publish(int value) { observers.each { it.update(value) } }
}

def subject = new Subject()
subject.register(new PrintObserver(id: 'obs1'))
subject.register(new PrintObserver(id: 'obs2'))
subject.publish(5)
