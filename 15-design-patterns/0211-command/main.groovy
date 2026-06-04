class Counter { int value = 0 }

interface Command {
    void execute()
    void undo()
}

class AddCommand implements Command {
    Counter counter
    int amount
    void execute() { counter.value += amount }
    void undo() { counter.value -= amount }
}

def counter = new Counter()
def cmd = new AddCommand(counter: counter, amount: 5)

cmd.execute()
print(counter.value)
cmd.undo()
print(" ${counter.value}")
println()
