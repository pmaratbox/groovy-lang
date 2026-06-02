def word = "hello"
int count = 0
word.each { ch ->
    if ('aeiou'.contains(ch)) count++
}
println count
