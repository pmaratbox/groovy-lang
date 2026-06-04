class Color {
    int r, g, b

    static Color fromHex(String hex) {
        def h = hex.startsWith('#') ? hex.substring(1) : hex
        new Color(
            r: Integer.parseInt(h[0..1], 16),
            g: Integer.parseInt(h[2..3], 16),
            b: Integer.parseInt(h[4..5], 16))
    }
}

def c = Color.fromHex('#ff0000')
println "${c.r} ${c.g} ${c.b}"
