def rol8 = { int x -> ((x << 1) | (x >> 7)) & 0xff }
println("${rol8(1)} ${rol8(128)}")
