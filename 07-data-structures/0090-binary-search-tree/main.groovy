class Node {
    int value
    Node left
    Node right
    Node(int value) { this.value = value }
}

Node insert(Node root, int value) {
    if (root == null) return new Node(value)
    if (value < root.value) root.left = insert(root.left, value)
    else root.right = insert(root.right, value)
    return root
}

void inorder(Node root, List out) {
    if (root == null) return
    inorder(root.left, out)
    out << root.value
    inorder(root.right, out)
}

Node root = null
[5, 3, 8, 1, 4].each { root = insert(root, it) }

def out = []
inorder(root, out)
println out.join(" ")
