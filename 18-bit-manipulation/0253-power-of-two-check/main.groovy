def isPow2 = { int n -> n > 0 && (n & (n - 1)) == 0 }
println("${isPow2(16) ? 'yes' : 'no'} ${isPow2(18) ? 'yes' : 'no'}")
