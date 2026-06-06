// Fine-grained reactivity from scratch: a writable signal and a derived computed.

class Signal {
    private Object value
    private List<Closure> subscribers = []

    Signal(Object initial) { this.value = initial }

    Object read() { value }

    void write(Object next) {
        value = next
        subscribers.each { it.call() }
    }

    void subscribe(Closure recompute) { subscribers << recompute }
}

class Computed {
    private Object cached
    private final Closure compute

    Computed(Closure compute, List<Signal> deps) {
        this.compute = compute
        deps.each { it.subscribe { recompute() } }
        recompute()
    }

    private void recompute() { cached = compute.call() }

    Object read() { cached }
}

def a = new Signal(2)
def b = new Signal(3)
def sum = new Computed({ a.read() + b.read() }, [a, b])

println sum.read()   // 5

a.write(10)
println sum.read()   // 13
