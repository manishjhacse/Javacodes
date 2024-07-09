class Tree {
    int val;
    Tree left, right;

    Tree(int val) {
        this.val = val;
        left = right = null;
    }
}

public class ValidatBST {
    public static boolean isValidBST(Tree root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }

    public static void main(String[] args) {
        Tree tree1 = new Tree(50);
        tree1.left = new Tree(30);
        tree1.left.left = new Tree(20);
        tree1.left.right = new Tree(40);
        tree1.right = new Tree(70);
        tree1.right.left = new Tree(60);
        tree1.right.right = new Tree(90);
        System.out.println("Tree 1 is BST: " + isValidBST(tree1, Integer.MIN_VALUE, Integer.MAX_VALUE));
        Tree tree2 = new Tree(50);
        tree2.left = new Tree(15);
        tree2.left.left = new Tree(20);
        tree2.left.right = new Tree(40);
        tree2.right = new Tree(70);
        tree2.right.left = new Tree(60);
        tree2.right.right = new Tree(90);
        System.out.println("Tree 2 is BST: " + isValidBST(tree2, Integer.MIN_VALUE, Integer.MAX_VALUE));

    }
}