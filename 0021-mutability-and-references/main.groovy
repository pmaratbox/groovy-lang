def inc(List<Integer> box) {
    box[0] += 1
}

def box = [1]
println "before: ${box[0]}"
inc(box)
println "after: ${box[0]}"
