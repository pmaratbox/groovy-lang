class Glyph {
    String symbol
}

class GlyphFactory {
    private Map<String, Glyph> cache = [:]
    int created = 0

    Glyph get(String symbol) {
        cache.computeIfAbsent(symbol) { created++; new Glyph(symbol: it) }
    }
}

def factory = new GlyphFactory()
['a', 'b', 'a'].each { factory.get(it) }
println(factory.created)
