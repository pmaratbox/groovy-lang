int parseOrDefault(String s) {
    try {
        return Integer.parseInt(s)
    } catch (NumberFormatException e) {
        return 0
    }
}

println "${parseOrDefault('42')} ${parseOrDefault('x')}"
