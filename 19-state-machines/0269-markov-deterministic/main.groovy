def next = [A: 'B', B: 'C', C: 'A']
def state = 'A'
def visited = []
3.times {
    state = next[state]
    visited << state
}
println visited.join(' ')
