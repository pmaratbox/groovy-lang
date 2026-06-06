// ReplaySubject: buffers the last N values and replays them to late subscribers.
class ReplaySubject {
    final int bufferSize
    final List buffer = []
    final List observers = []

    ReplaySubject(int bufferSize) { this.bufferSize = bufferSize }

    void subscribe(Closure onNext) {
        observers << onNext
        buffer.each { onNext(it) }   // replay buffered values to the new subscriber
    }

    void next(value) {
        buffer << value
        while (buffer.size() > bufferSize) buffer.remove(0)
        observers.each { it(value) }
    }
}

def subject = new ReplaySubject(2)
subject.next(1)
subject.next(2)
subject.next(3)                       // buffer now [2, 3]
subject.subscribe { println it }      // late subscriber: receives 2, then 3
subject.next(4)                       // subscriber receives 4
