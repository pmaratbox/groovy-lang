record Point(int x, int y) {}
println Point.recordComponents.collect { it.name }.join(' ')
