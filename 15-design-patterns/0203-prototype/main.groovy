class Prototype implements Cloneable {
    int value
    Prototype copy() { new Prototype(value: value) }
}

def original = new Prototype(value: 1)
def clone = original.copy()
clone.value = 2

println("${original.value} ${clone.value}")
