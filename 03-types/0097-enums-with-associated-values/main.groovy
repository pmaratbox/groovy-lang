def area(shape) {
    switch (shape.type) {
        case "rect": return shape.w * shape.h
        case "square": return shape.s * shape.s
    }
}

def shapes = [[type: "rect", w: 2, h: 3], [type: "square", s: 4]]
shapes.each { shape ->
    println area(shape)
}
