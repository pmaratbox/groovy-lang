// Cold vs hot observables, built from scratch.
//
// COLD: subscribe() runs the producer independently for each subscriber, so
// every observer gets its own private execution (1 2 3 each).
//
// HOT: one shared producer drives a list of observers; values emitted before a
// subscriber joins are missed by that subscriber.

class Cold {
    final Closure producer

    Cold(Closure producer) { this.producer = producer }

    void subscribe(Closure onNext) {
        // Re-run the producer per subscriber: a fresh, independent execution.
        producer(onNext)
    }
}

class Hot {
    final List<Closure> observers = []

    void subscribe(Closure onNext) { observers << onNext }

    // The single shared execution: emit to whoever is currently subscribed.
    void emit(value) { observers.each { it(value) } }
}

// --- Cold: each subscriber gets the full 1 2 3 ---
def cold = new Cold({ onNext -> [1, 2, 3].each { onNext(it) } })

def coldA = []
def coldB = []
cold.subscribe { coldA << it }
cold.subscribe { coldB << it }

// --- Hot: A subscribes, 1 is emitted, then B subscribes, then 2 3 ---
def hot = new Hot()
def hotA = []
def hotB = []
hot.subscribe { hotA << it }
hot.emit(1)
hot.subscribe { hotB << it }
hot.emit(2)
hot.emit(3)

println "cold A: ${coldA.join(' ')}"
println "cold B: ${coldB.join(' ')}"
println "hot A: ${hotA.join(' ')}"
println "hot B: ${hotB.join(' ')}"
