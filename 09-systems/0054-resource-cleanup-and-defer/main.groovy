class Resource implements Closeable {
    Resource() { println "open" }
    void close() { println "close" }
}

new Resource().withCloseable {
    println "use"
}
