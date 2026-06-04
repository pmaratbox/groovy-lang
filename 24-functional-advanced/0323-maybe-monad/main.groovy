def some = { v -> [present: true, value: v] }
def none = [present: false, value: null]
def bind = { m, f -> m.present ? f(m.value) : m }

def chain = { m ->
    bind(bind(m, { x -> some(x + 3) }), { x -> some(x * 2) })
}

def r1 = chain(some(2))
def r2 = chain(none)

println "${r1.present ? r1.value : 'none'} ${r2.present ? r2.value : 'none'}"
