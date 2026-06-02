import java.util.stream.Stream

def first3 = Stream.iterate(1, { it + 1 })
    .map { it * it }
    .limit(3)
    .toList()
println first3.join(" ")
