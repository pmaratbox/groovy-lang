def threads = (1..3).collect { i ->
    Thread.start { Math.sqrt(i) }
}
threads*.join()
println "done: ${threads.size()}"
