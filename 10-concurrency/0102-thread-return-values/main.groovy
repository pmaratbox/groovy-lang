def results = new int[2]
def t1 = Thread.start { results[0] = 3 * 3 }
def t2 = Thread.start { results[1] = 4 * 4 }
t1.join()
t2.join()
println results.sum()
