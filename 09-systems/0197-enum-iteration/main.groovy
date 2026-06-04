enum Color { RED, GREEN, BLUE }
println Color.values().collect { it.name() }.join(' ')
