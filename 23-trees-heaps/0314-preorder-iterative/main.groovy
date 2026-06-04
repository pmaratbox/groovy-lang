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

Node tree = null
[5, 3, 8, 1, 4].each { tree = insert(tree, it) }

def stack = new ArrayDeque<Node>()
stack.push(tree)
def order = []
while (!stack.isEmpty()) {
    Node n = stack.pop()
    order << n.val
    if (n.right != null) stack.push(n.right)
    if (n.left != null) stack.push(n.left)
}
println(order.join(' '))
