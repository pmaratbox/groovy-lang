def names = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
def start = 6 // Saturday
def result = (start + 3) % 7
println names[result]
