import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeTraversal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("In order traversal: ");
        inOrder(root);
        System.out.println("END");
        System.out.println("Pre order traversal: ");
        preOrder(root);
        System.out.println("END");
        System.out.println("Post order traversal: ");
        postOrder(root);
        System.out.println("END");
        System.out.println("Level order traversal: ");
        levelOrderTraversal(root);
        System.out.println("END");
    }

    static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.value + "-->");
        inOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + "-->");
    }

    static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.value + "-->");
        preOrder(root.left);
        preOrder(root.right);
    }

    
    static void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root == null)
            return;
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.value + "-->");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }

    static Node createTree() {
        Node root = null;
        System.out.print("Enter data(-1 to stop): ");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("left of " + data);
        root.left = createTree();
        System.out.println("right of " + data);
        root.right = createTree();
        return root;
    }
}

class Node {
    Node left, right;
    int value;

    public Node(int value) {
        this.value = value;
    }
}