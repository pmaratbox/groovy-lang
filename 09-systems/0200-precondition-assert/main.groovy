def check = { int arg ->
    if (arg > 0) {
        println "ok"
    } else {
        throw new IllegalArgumentException("must be positive")
    }
}

check(5)
try {
    check(-1)
} catch (IllegalArgumentException e) {
    println "error: ${e.message}"
}
