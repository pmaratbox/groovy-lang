def nums = [1, 2, 3, 4, 5, 6, 7]
nums.collate(3).each { chunk ->
    println chunk.join(" ")
}
