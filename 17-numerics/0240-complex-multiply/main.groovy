def multiply(ar, ai, br, bi) {
    [ar * br - ai * bi, ar * bi + ai * br]
}

def (re, im) = multiply(1, 2, 3, 4)
println "$re $im"
