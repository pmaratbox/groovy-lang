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

Node deleteNode(Node root, int v) {
    if (root == null) return null
    if (v < root.val) { root.left = deleteNode(root.left, v); return root }
    if (v > root.val) { root.right = deleteNode(root.right, v); return root }
    if (root.left == null) return root.right
    if (root.right == null) return root.left
    Node succ = root.right
    while (succ.left != null) succ = succ.left
    root.val = succ.val
    root.right = deleteNode(root.right, succ.val)
    root
}

void inorder(Node root, List acc) {
    if (root == null) return
    inorder(root.left, acc); acc << root.val; inorder(root.right, acc)
}

Node tree = null
[5, 3, 8, 1, 4].each { tree = insert(tree, it) }
tree = deleteNode(tree, 3)

def acc = []
inorder(tree, acc)
println(acc.join(' '))
