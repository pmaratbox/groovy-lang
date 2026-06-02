outer:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j > i) continue outer
        if (i * j == 4) {
            println "stop at ${i},${j}"
            break outer
        }
        println "${i},${j}"
    }
}
