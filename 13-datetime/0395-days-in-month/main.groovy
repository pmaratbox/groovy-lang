def leap = { y -> (y % 4 == 0 && y % 100 != 0) || y % 400 == 0 }
def febDays = { y -> leap(y) ? 29 : 28 }
println "${febDays(2000)} ${febDays(2001)}"
