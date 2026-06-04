def transition = { state, event ->
    if (state == 'locked' && event == 'coin') return 'unlocked'
    if (state == 'unlocked' && event == 'push') return 'locked'
    if (state == 'locked' && event == 'push') return 'locked'
    state
}
def state = 'locked'
def visited = []
['coin', 'push', 'push'].each { event ->
    state = transition(state, event)
    visited << state
}
println visited.join(' ')
