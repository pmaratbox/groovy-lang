def levels = [DEBUG: 0, INFO: 1, WARN: 2, ERROR: 3]
def threshold = levels.WARN
[['INFO', 'i'], ['WARN', 'w'], ['ERROR', 'e']].each { level, msg ->
    if (levels[level] >= threshold) {
        println "${level}: ${msg}"
    }
}
