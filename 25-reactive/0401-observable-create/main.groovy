// A push-based Observable built from scratch: it is just a function that
// takes an observer (a map of closures with `next` and `complete`).
def observable = { observer ->
    observer.next(1)
    observer.next(2)
    observer.next(3)
    observer.complete()
}

def observer = [
    next: { value -> println value },
    complete: { println 'done' },
]

observable(observer)
