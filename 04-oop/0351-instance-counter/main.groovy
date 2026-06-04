class Widget {
    static int count = 0

    Widget() {
        count++
    }
}

new Widget()
new Widget()
new Widget()
println Widget.count
