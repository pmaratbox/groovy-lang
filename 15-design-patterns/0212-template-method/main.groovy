abstract class Algorithm {
    abstract String step()
    String run() { ['start', step(), 'end'].join(' ') }
}

class WorkAlgorithm extends Algorithm {
    String step() { 'work' }
}

println(new WorkAlgorithm().run())
