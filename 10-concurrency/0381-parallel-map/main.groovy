def input = [1, 2, 3, 4]
def results = new int[input.size()]

def threads = input.indices.collect { i ->
    Thread.start {
        results[i] = input[i] * input[i]
    }
}
threads*.join()
println results.join(' ')
