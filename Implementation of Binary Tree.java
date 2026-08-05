class BinaryTree {

    // Node class
    class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    Node root;

    // Inorder Traversal (Left, Root, Right)
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    // Preorder Traversal (Root, Left, Right)
    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // Postorder Traversal (Left, Right, Root)
    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        // Creating the binary tree
        tree.root = tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.left.left = tree.new Node(4);
        tree.root.left.right = tree.new Node(5);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);

        System.out.println();

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);

        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
    }
}
