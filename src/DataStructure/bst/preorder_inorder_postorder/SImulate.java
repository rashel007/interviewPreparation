package DataStructure.bst.preorder_inorder_postorder;

public class SImulate {

    // Preorder - <data><left><right>
    // InOrder - <left><data><right>
    // PostOrder - <left><right><data>

    public static void main(String[] args) {


        BstNode root = null;
        BST bst = new BST();

        root = bst.insert(root, 50);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 30);
        root = bst.insert(root, 45);
        root = bst.insert(root, 55);
        root = bst.insert(root, 70);

        preorder(root);
        System.out.println("----------");
        inorder(root);
        System.out.println("----------");
        postOrder(root);
    }

    private static void preorder(BstNode root) {

        if (root == null) return;

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    private static void inorder(BstNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    private static void postOrder(BstNode root) {

        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
}
