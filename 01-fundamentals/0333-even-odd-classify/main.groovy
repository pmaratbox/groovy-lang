def labels = [1, 2, 3, 4].collect { it % 2 == 0 ? 'even' : 'odd' }
println labels.join(' ')
