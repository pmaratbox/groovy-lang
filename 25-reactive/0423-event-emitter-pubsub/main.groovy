class EventEmitterPubsub {
    private final Map<String, List<Closure>> handlers = [:]

    void on(String topic, Closure handler) {
        handlers.computeIfAbsent(topic) { [] } << handler
    }

    void off(String topic, Closure handler) {
        handlers[topic]?.remove(handler)
    }

    void emit(String topic, def payload) {
        handlers[topic]?.each { it(payload) }
    }
}

def emitter = new EventEmitterPubsub()

def h = { payload -> println "hi ${payload}" }
def g = { payload -> println "bye ${payload}" }

emitter.on("greet", h)
emitter.on("bye", g)

emitter.emit("greet", "ada")
emitter.emit("bye", "ada")

emitter.off("greet", h)
emitter.emit("greet", "x")
