def inc = { it + 1 }
def double_ = { it * 2 }
def neg = { -it }

def pipe = inc >> double_ >> neg

println pipe(3)
