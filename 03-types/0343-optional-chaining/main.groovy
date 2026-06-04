def present = [b: [c: 5]]
def absent = [b: null]

def read = { m -> m?.b?.c ?: 0 }

println "${read(present)} ${read(absent)}"
