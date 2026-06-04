def seen = [] as Set
def result = "aabbcc".findAll { seen.add(it) }.join()
println result
