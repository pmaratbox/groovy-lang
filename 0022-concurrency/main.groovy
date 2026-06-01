def results = [0, 0]
def t1 = Thread.start { results[0] = 1 }
def t2 = Thread.start { results[1] = 2 }
t1.join()
t2.join()
println "sum: ${results[0] + results[1]}"
