[[true, true], [true, false], [false, true], [false, false]].each { a, b ->
    println "$a $b ${a && b} ${a || b} ${a ^ b}"
}
