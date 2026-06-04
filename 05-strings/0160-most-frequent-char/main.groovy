def counts = "hello".toList().countBy { it }
println counts.max { it.value }.key
