def sign = { x -> x <=> 0 }
println([-5, 0, 5].collect { sign(it) }.join(' '))
