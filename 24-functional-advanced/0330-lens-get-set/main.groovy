def lens = { getter, setter -> [getter: getter, setter: setter] }

// lens focused on b inside {a:{b:_}}
def bLens = lens(
    { s -> s.a.b },
    { s, v -> [a: [b: v]] }
)

def data = [a: [b: 1]]
def got = bLens.getter(data)
def updated = bLens.setter(data, 2)

println "${got} ${updated.a.b}"
