public class BST {
    public class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

    private Node root;

    public BST() {

    };

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        return node;
    }

    public void populate(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void display() {
        display(this.root, "Root node: ");
    }

    public void display(Node node, String details) {
        if (node == null)
            return;
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " is: ");
        display(node.right, "Right child of " + node.value + " is: ");
    }

    public boolean isEmpty() {
        return root == null;
    }

    public static void main(String[] args) {
        BST bst = new BST();
        int nums[] = { 5, 6, 8, 1, 2, 15, 3, 7 };
        bst.populate(nums);
        bst.display();
    }
}
