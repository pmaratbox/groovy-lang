try {
    throw new RuntimeException("boom")
} catch (RuntimeException e) {
    println "caught"
} finally {
    println "cleanup"
}
