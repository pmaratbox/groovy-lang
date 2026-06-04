int bits = 0b101

def rwx = new StringBuilder()
rwx << ((bits & 0b100) ? 'r' : '-')
rwx << ((bits & 0b010) ? 'w' : '-')
rwx << ((bits & 0b001) ? 'x' : '-')

println rwx
