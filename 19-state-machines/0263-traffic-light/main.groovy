def next = [red: 'green', green: 'yellow', yellow: 'red']
def state = 'red'
def visited = []
4.times {
    state = next[state]
    visited << state
}
println visited.join(' ')
