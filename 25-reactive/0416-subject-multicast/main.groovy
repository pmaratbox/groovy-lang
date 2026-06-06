// A Subject multicasts each emission to all current observers.
class SubjectMulticast {
    private final List<Closure> observers = []

    void subscribe(Closure obs) {
        observers << obs
    }

    void next(value) {
        observers.each { it(value) }
    }
}

def subject = new SubjectMulticast()
subject.subscribe { v -> println "obs1: $v" }
subject.subscribe { v -> println "obs2: $v" }

subject.next(1)
subject.next(2)
