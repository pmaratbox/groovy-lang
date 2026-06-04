def xs = ['a', 'b', 'a', 'c', 'b', 'a']
def counts = xs.countBy { it }
def top = counts.sort { -it.value }.keySet().take(2)
println top.join(' ')
