def stack = []
[1, 2, 3].each { n -> stack << { n } }
println stack.reverse().collect { it() }.join(' ')
