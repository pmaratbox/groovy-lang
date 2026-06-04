def parity = { int n -> Integer.bitCount(n) & 1 }
println("${parity(7)} ${parity(5)}")
