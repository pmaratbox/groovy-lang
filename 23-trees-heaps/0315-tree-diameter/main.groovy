class Node {
    String name
    Node left, right
    Node(String n) { name = n }
}

class Diameter {
    int best = 0

    int height(Node node) {
        if (node == null) return 0
        int lh = height(node.left)
        int rh = height(node.right)
        best = Math.max(best, lh + rh)
        1 + Math.max(lh, rh)
    }
}

def root = new Node('root')
root.left = new Node('A'); root.right = new Node('B')
root.left.left = new Node('C'); root.left.right = new Node('D')

def d = new Diameter()
d.height(root)
println(d.best)
