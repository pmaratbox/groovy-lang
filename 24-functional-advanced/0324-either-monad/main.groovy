def right = { v -> [ok: true, value: v] }
def left = { e -> [ok: false, value: e] }
def bind = { m, f -> m.ok ? f(m.value) : m }

def safeDiv = { a, b -> b == 0 ? left('err') : right((a.intdiv(b))) }

// 8 / 2 / 2 -> 2
def r1 = bind(bind(right(8), { x -> safeDiv(x, 2) }), { x -> safeDiv(x, 2) })
// 4 / 0 -> err (short-circuits)
def r2 = bind(bind(right(4), { x -> safeDiv(x, 0) }), { x -> safeDiv(x, 2) })

def show = { m -> m.value }
println "${show(r1)} ${show(r2)}"
