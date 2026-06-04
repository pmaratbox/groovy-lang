def leap(int year) {
    year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}

def label = { leap(it) ? 'yes' : 'no' }
println([2000, 1900, 2024].collect(label).join(' '))
