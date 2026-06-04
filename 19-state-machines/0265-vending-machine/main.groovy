def price = 25
def total = 0
def state = 'collecting'
[10, 10, 5].each { coin ->
    if (state == 'collecting') {
        total += coin
        if (total >= price) {
            state = 'dispensing'
            println 'dispensed'
        }
    }
}
