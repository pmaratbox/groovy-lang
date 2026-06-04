int count = 0
Closure wrapped = { -> count++ }
5.times { wrapped() }
println "calls: ${count}"
