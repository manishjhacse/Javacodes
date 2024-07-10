class Tree {
    Tree left, right;
    int val;

    Tree(int val) {
        this.val = val;
        left = right = null;
    }
}

public class Operations {
    Tree insertBST(Tree root, int val) {
        if (root == null) {
            Tree node = new Tree(val);
            return node;
        } else if (val < root.val) {
            root.left = insertBST(root.left, val);
        } else {
            root.right = insertBST(root.right, val);
        }
        return root;
    }

    boolean searchInBST(Tree root, int val) {
        if (root == null) {
            return false;
        } else if (root.val == val) {
            return true;
        } else if (val < root.val) {
            return searchInBST(root.left, val);
        } else {
            return searchInBST(root.right, val);
        }
    }

    Tree insertBSTArray(Tree root, int val[]) {
        for (int i = 0; i < val.length; i++) {
            root = insertBST(root, val[i]);
        }
        return root;
    }

    void inorderTraversal(Tree root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.val + "-->");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        Operations obj = new Operations();
        Tree tree1 = new Tree(25);
        obj.insertBST(tree1, 23);
        obj.insertBST(tree1, -5);
        int arr[] = { 5, 4, 3, 2, 78, 69 };
        obj.insertBSTArray(tree1, arr);
        obj.inorderTraversal(tree1);
        System.out.println();
        System.out.println("23 is present in BST: " + obj.searchInBST(tree1, 23));
        System.out.println("43 is present in BST: " + obj.searchInBST(tree1, 43));
    }
}
