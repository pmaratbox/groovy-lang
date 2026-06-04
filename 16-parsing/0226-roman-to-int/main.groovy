def values = ['I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000]
def roman = "XIV"
int total = 0
for (int i = 0; i < roman.length(); i++) {
    int cur = values[roman[i] as String]
    if (i + 1 < roman.length() && values[roman[i + 1] as String] > cur) total -= cur
    else total += cur
}
println total
