class Handler {
    int level
    Handler next

    void handle(int request) {
        if (request == level) {
            println("handled by ${level}")
        } else if (next != null) {
            next.handle(request)
        }
    }
}

def h3 = new Handler(level: 3)
def h2 = new Handler(level: 2, next: h3)
def h1 = new Handler(level: 1, next: h2)

h1.handle(2)
