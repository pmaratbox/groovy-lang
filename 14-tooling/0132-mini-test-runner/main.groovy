def tests = [
    "adds": { assert 2 + 3 == 5 },
    "concats": { assert "a" + "b" == "ab" },
    "reverses": { assert [1, 2, 3].reverse() == [3, 2, 1] },
]

int passed = 0, failed = 0
tests.each { name, test ->
    try {
        test()
        passed++
    } catch (Throwable t) {
        failed++
    }
}

println "$passed passed, $failed failed"
