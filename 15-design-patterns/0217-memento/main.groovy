class Memento {
    int state
}

class Originator {
    int state
    Memento save() { new Memento(state: state) }
    void restore(Memento m) { state = m.state }
}

def originator = new Originator(state: 1)
def memento = originator.save()
originator.state = 2

print(originator.state)
originator.restore(memento)
println(" ${originator.state}")
