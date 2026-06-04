class Node {
    int val
    Node left, right
    Node(int v) { val = v }
}

Node insert(Node root, int v) {
    if (root == null) return new Node(v)
    if (v < root.val) root.left = insert(root.left, v)
    else if (v > root.val) root.right = insert(root.right, v)
    root
}

boolean search(Node root, int v) {
    if (root == null) return false
    if (v == root.val) return true
    v < root.val ? search(root.left, v) : search(root.right, v)
}

Node tree = null
[5, 3, 8, 1, 4].each { tree = insert(tree, it) }

println([4, 6].collect { search(tree, it) ? 'yes' : 'no' }.join(' '))
