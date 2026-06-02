def classify(n) {
    if (n < 0) return "negative"
    if (n == 0) return "zero"
    return "positive"
}

[-1, 0, 5].each { println classify(it) }
