# 0423 — EventEmitter (Pub/Sub)

Build a multi-topic EventEmitter with on(topic, handler), emit(topic, payload), and off(topic, handler). A Map of topic to a List of Closures, with computeIfAbsent registering handlers and GString interpolation formatting each payload.

## Run

    groovy main.groovy
