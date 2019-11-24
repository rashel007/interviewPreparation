package DataStructure.bst.level_order_traversal;


public class BST {


    public BstNode insert(BstNode root, int data) {
        if (root == null) {
            root = getNode(data);
        } else if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }


    private BstNode getNode(int data) {
        BstNode bstNode = new BstNode();
        bstNode.data = data;
        bstNode.left = null;
        bstNode.right = null;

        return bstNode;
    }

    public boolean search(BstNode root, int data) {

        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (data <= root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

     int findMin(BstNode root) {


        if (root == null) {
            return -1;
        } else if (root.left == null) {
            return root.data;
        }

        return findMin(root.left);


    }

    int findMax(BstNode root) {
        if (root == null) {
            return -1;
        } else if (root.right == null) {
            return root.data;
        }

        return findMax(root.right);
    }

    int findHeight(BstNode root) {

        if (root == null) {
            return -1;
        }

        System.out.println(root.data);

        int min = findHeight(root.left);
        int max = findHeight(root.right);

        if (min > max) {
            return min +1;
        } else
            return max + 1;
    }


}
