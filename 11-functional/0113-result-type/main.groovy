def ok = { v -> [tag: 'ok', value: v] }
def err = { m -> [tag: 'err', msg: m] }

def safeDiv = { a, b -> b == 0 ? err('divide by zero') : ok(a.intdiv(b)) }

[safeDiv(10, 2), safeDiv(1, 0)].each { r ->
    println r.tag == 'ok' ? "ok: ${r.value}" : "err: ${r.msg}"
}
