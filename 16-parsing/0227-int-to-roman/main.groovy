def table = [
    [1000, 'M'], [900, 'CM'], [500, 'D'], [400, 'CD'],
    [100, 'C'], [90, 'XC'], [50, 'L'], [40, 'XL'],
    [10, 'X'], [9, 'IX'], [5, 'V'], [4, 'IV'], [1, 'I']
]
int n = 14
def sb = new StringBuilder()
for (entry in table) {
    while (n >= entry[0]) {
        sb << entry[1]
        n -= entry[0]
    }
}
println sb.toString()
