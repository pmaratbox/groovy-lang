def total = 10 * 60 + 45 + 90
def hh = total.intdiv(60)
def mm = total % 60
println String.format('%02d:%02d', hh, mm)
