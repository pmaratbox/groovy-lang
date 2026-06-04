int attempts = 0

def operation = {
    attempts++
    if (attempts < 3) throw new RuntimeException("fail")
    return "value"
}

def maxAttempts = 5
for (int i = 1; i <= maxAttempts; i++) {
    try {
        operation()
        println "ok after ${attempts}"
        break
    } catch (RuntimeException e) {
        // retry
    }
}
