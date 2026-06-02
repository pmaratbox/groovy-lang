def nums = [1, 2, 3, 4]
nums.collate(2, 1, false).each { window ->
    println window.join(" ")
}
