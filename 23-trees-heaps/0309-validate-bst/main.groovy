class Node {
    int val
    Node left, right
    Node(int v) { val = v }
}

boolean isBst(Node node, Long low, Long high) {
    if (node == null) return true
    if (low != null && node.val <= low) return false
    if (high != null && node.val >= high) return false
    isBst(node.left, low, node.val as Long) && isBst(node.right, node.val as Long, high)
}

def good = new Node(5)
good.left = new Node(3); good.right = new Node(8)
good.left.left = new Node(1); good.left.right = new Node(4)

def bad = new Node(5)
bad.left = new Node(3); bad.right = new Node(8)
bad.left.left = new Node(1); bad.left.right = new Node(6)

println([good, bad].collect { isBst(it, null, null) ? 'yes' : 'no' }.join(' '))
