def makeCounter() {
    int count = 0
    return { -> count += 1; count }
}

def next = makeCounter()
println "count: ${next()}"
println "count: ${next()}"
