final int READ = 1
final int WRITE = 2

int flags = READ | WRITE
String set = (flags & WRITE) != 0 ? "yes" : "no"
println "$flags $set"
