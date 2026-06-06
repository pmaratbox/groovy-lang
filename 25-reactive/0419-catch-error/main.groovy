// A push-based Observable built from scratch: subscribe wires a producer to an
// observer (a map of next/error/complete closures). catchError forwards next
// values, but swaps to a fallback stream when the source errors.

def observable = { producer -> [subscribe: { observer -> producer(observer) }] }

def source = observable { observer ->
    observer.next(1)
    observer.next(2)
    observer.error(new RuntimeException('boom'))
}

def fallback = observable { observer ->
    observer.next(9)
    observer.complete()
}

def catchError = { src, fb ->
    observable { observer ->
        src.subscribe([
            next    : { v -> observer.next(v) },
            error   : { e -> fb.subscribe(observer) },
            complete: { observer.complete() },
        ])
    }
}

catchError(source, fallback).subscribe([
    next    : { v -> println v },
    error   : { e -> },
    complete: { },
])
