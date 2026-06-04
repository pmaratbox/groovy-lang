class TrieNode {
    Map<Character, TrieNode> children = [:]
    boolean end = false
}

class Trie {
    TrieNode root = new TrieNode()
    void insert(String word) {
        def node = root
        word.each { ch ->
            def c = ch as Character
            node = node.children.computeIfAbsent(c) { new TrieNode() }
        }
        node.end = true
    }
    boolean search(String word) {
        def node = root
        for (ch in word) {
            node = node.children[ch as Character]
            if (node == null) return false
        }
        node.end
    }
}

def trie = new Trie()
trie.insert("cat")
trie.insert("car")
println([trie.search("car") ? "yes" : "no", trie.search("can") ? "yes" : "no"].join(' '))
