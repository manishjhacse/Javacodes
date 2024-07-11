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

    Tree getMin(Tree root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    Tree deleteNode(Tree root, int key) {
        Tree parent = null;
        Tree current = root;
        while (current != null && current.val != key) {
            parent = current;
            if (key < current.val)
                current = current.left;
            else
                current = current.right;
        }
        if (current == null) {
            return root;
        }
        // node to be deleted it leaf node
        if (current.left == null && current.right == null) {
            if (current == root) {
                return null;
            }
            if (parent.left == current) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        // node to be deleted has one child node
        else if (current.left == null || current.right == null) {
            Tree temp = null;
            if (current.left != null) {
                temp = current.left;
            } else {
                temp = current.right;
            }
            if (current == root) {
                root = temp;
            } else if (parent.left == current) {
                parent.left = temp;
            } else {
                parent.right = temp;
            }

        }
        // node to be deleted has 2 child node
        else {
            Tree minRight = getMin(current.right);
            int minVal = minRight.val;
            deleteNode(current, minVal);
            current.val = minVal;
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
        tree1 = obj.insertBST(tree1, 23);
        tree1 = obj.insertBST(tree1, -5);
        int arr[] = { 5, 4, 3, 2, 78, 69 };
        tree1 = obj.insertBSTArray(tree1, arr);
        obj.inorderTraversal(tree1);
        System.out.println();
        System.out.println("23 is present in BST: " + obj.searchInBST(tree1, 23));
        tree1 = obj.deleteNode(tree1, 23);
        obj.inorderTraversal(tree1);
        System.out.println();
        System.out.println("23 is present in BST: " + obj.searchInBST(tree1, 23));
    }
}
