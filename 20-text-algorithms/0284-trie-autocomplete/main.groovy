class TrieNode {
    Map<Character, TrieNode> children = new TreeMap<>()
    boolean end = false
}

class Trie {
    TrieNode root = new TrieNode()

    void insert(String word) {
        def node = root
        word.each { c ->
            node = node.children.computeIfAbsent(c as Character) { new TrieNode() }
        }
        node.end = true
    }

    List<String> autocomplete(String prefix) {
        def node = root
        for (c in prefix) {
            node = node.children[c as Character]
            if (node == null) return []
        }
        def res = []
        collect(node, prefix, res)
        res
    }

    private void collect(TrieNode node, String path, List<String> res) {
        if (node.end) res << path
        node.children.each { ch, child -> collect(child, path + ch, res) }
    }
}

def trie = new Trie()
["car", "card", "dog"].each { trie.insert(it) }
println trie.autocomplete("car").join(" ")
