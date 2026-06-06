// Observer contract: next* then a single terminal (complete or error).
// We implement a SafeObserver from scratch that wraps next/error/complete
// with a "stopped" flag set on the first terminal; afterwards every call
// is a no-op.

class SafeObserver {
    private boolean stopped = false
    private Closure onNext
    private Closure onError
    private Closure onComplete

    SafeObserver(Closure onNext, Closure onError, Closure onComplete) {
        this.onNext = onNext
        this.onError = onError
        this.onComplete = onComplete
    }

    void next(value) {
        if (stopped) return
        onNext(value)
    }

    void error(err) {
        if (stopped) return
        stopped = true
        onError(err)
    }

    void complete() {
        if (stopped) return
        stopped = true
        onComplete()
    }
}

def observer = new SafeObserver(
    { v -> println v },
    { e -> println "error: $e" },
    { -> println "complete" }
)

// Sequence: next(1), next(2), complete(), next(3) [ignored].
observer.next(1)
observer.next(2)
observer.complete()
observer.next(3)
