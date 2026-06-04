(1..15).each { n ->
    if (n % 15 == 0) println 'FizzBuzz'
    else if (n % 3 == 0) println 'Fizz'
    else if (n % 5 == 0) println 'Buzz'
    else println n
}
