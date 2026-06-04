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

int height(Node root) {
    root == null ? 0 : 1 + Math.max(height(root.left), height(root.right))
}

Node tree = null
[5, 3, 8, 1, 4].each { tree = insert(tree, it) }
println(height(tree))
