interface Shape { String kind() }

class Circle implements Shape { String kind() { 'circle' } }
class Square implements Shape { String kind() { 'square' } }

static Shape create(String name) {
    switch (name) {
        case 'circle': return new Circle()
        case 'square': return new Square()
        default: throw new IllegalArgumentException(name)
    }
}

println([create('circle').kind(), create('square').kind()].join(' '))
