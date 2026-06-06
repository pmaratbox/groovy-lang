// A BehaviorSubject holds a current value and replays it to each new subscriber.
class BehaviorSubject {
    private current
    private final List observers = []

    BehaviorSubject(initial) { current = initial }

    Closure subscribe(Closure observer) {
        observers << observer
        observer(current) // replay the current value immediately
        return { observers.remove(observer) }
    }

    void next(value) {
        current = value
        observers.each { it(value) }
    }
}

def subject = new BehaviorSubject(0)

subject.subscribe { v -> println "A: $v" }
subject.next(1)
subject.subscribe { v -> println "B: $v" }
subject.next(2)
