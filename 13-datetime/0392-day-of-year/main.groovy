def monthDays = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
def month = 3
def day = 1
def doy = (0..<(month - 1)).sum { monthDays[it] } + day
println doy
