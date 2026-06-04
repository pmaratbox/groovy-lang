def sumTo
sumTo = { n, acc ->
    n == 0 ? acc : sumTo.trampoline(n - 1, acc + n)
}.trampoline()

println sumTo(100, 0)
