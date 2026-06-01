class TooLargeException extends Exception {
    TooLargeException(String message) {
        super(message)
    }
}

def check(int n) {
    if (n > 100) {
        throw new TooLargeException("value too large")
    }
}

try {
    check(200)
} catch (TooLargeException e) {
    println "error: ${e.message}"
}
