class LruCache {
    int capacity
    LinkedHashMap<Integer, Integer> map

    LruCache(int capacity) {
        this.capacity = capacity
        this.map = new LinkedHashMap<>()
    }

    Integer get(int key) {
        if (!map.containsKey(key)) return -1
        def value = map.remove(key)
        map.put(key, value)
        return value
    }

    void put(int key, int value) {
        if (map.containsKey(key)) map.remove(key)
        else if (map.size() >= capacity) map.remove(map.keySet().iterator().next())
        map.put(key, value)
    }
}

def cache = new LruCache(2)
cache.put(1, 1)
cache.put(2, 2)
cache.get(1)
cache.put(3, 3)
println("${cache.get(1)} ${cache.get(2)}")
