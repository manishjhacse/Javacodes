class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class HeightOfTree {
    public static int height(TreeNode root){
        if (root == null) 
        return 0;
        else
         return 1+Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(7);
        root.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        System.out.println("Height of the tree is: " + height(root));
    }
}
