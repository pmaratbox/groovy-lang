class MultisetCount {
    Map<Integer, Integer> counts = [:].withDefault { 0 }

    void add(int element) {
        counts[element] = counts[element] + 1
    }

    void remove(int element) {
        if (counts[element] > 0) counts[element] = counts[element] - 1
    }

    int count(int element) {
        counts[element]
    }
}

def multiset = new MultisetCount()
multiset.add(1)
multiset.add(1)
multiset.add(2)
def first = multiset.count(1)
multiset.remove(1)
def second = multiset.count(1)
println("${first} ${second}")
