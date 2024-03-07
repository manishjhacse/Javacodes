import java.util.Scanner;

public class BinaryTree {
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int val) {
            this.value = val;
        }
    }

    private Node root;

    public void addNode(Scanner scanner) {
        System.out.print("Enter the root node: ");
        int val = scanner.nextInt();
        root = new Node(val);
        addNode(scanner, root);
    }

    public void addNode(Scanner scanner, Node node) {
        System.out.print("do you want to enter left of (y/n) " + node.value + ": ");
        char left = scanner.next().charAt(0);
        if (left == 'y' || left == 'Y') {
            System.out.print("Enter the value of the left of " + node.value + ": ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            addNode(scanner, node.left);
        }
        System.out.print("do you want to enter right of (y/n) " + node.value + ": ");
        char right = scanner.next().charAt(0);
        if (right == 'y' || left == 'Y') {
            System.out.print("Enter the value of the right of " + node.value + ": ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            addNode(scanner, node.right);
        }
    }

    public void display() {
        System.out.println("Tree is:");
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.addNode(sc);
        tree.display();
    }
}
