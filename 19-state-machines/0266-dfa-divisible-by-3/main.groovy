def divisibleBy3 = { String bits ->
    int state = 0
    bits.each { c ->
        int b = Character.getNumericValue(c as char)
        state = (state * 2 + b) % 3
    }
    state == 0 ? 'yes' : 'no'
}
println "${divisibleBy3('110')} ${divisibleBy3('100')}"
