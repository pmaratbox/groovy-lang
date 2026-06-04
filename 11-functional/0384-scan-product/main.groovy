def xs = [1, 2, 3, 4]

def acc = 1
def scan = xs.collect { acc *= it; acc }

println scan.join(' ')
