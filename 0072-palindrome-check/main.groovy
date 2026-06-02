["level", "hello"].each { word ->
    def isPal = word == word.reverse()
    println "${word}: ${isPal ? 'yes' : 'no'}"
}
