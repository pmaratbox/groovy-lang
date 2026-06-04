def check = { boolean cond, String label ->
    if (!cond) throw new AssertionError("failed: $label")
}

check(1 + 1 == 2, "1+1==2")
check("ab".size() == 2, "ab length")
check([1, 2, 3].sum() == 6, "sum 1..3")

println "all passed"
