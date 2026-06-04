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

def queue = new LinkedList<Node>()
queue.add(tree)
def order = []
while (!queue.isEmpty()) {
    Node n = queue.poll()
    order << n.val
    if (n.left != null) queue.add(n.left)
    if (n.right != null) queue.add(n.right)
}
println(order.join(' '))
