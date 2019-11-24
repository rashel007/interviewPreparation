package DataStructure.bst;

public class Simulate {
    public static void main(String[] args) {

        BstNode root = null;

        BST bst = new BST();

        root = bst.insert(root, 10);

        root = bst.insert(root, 5);
        root = bst.insert(root, 6);
        root = bst.insert(root, 8);
        root = bst.insert(root, 7);
        root = bst.insert(root, 4);

//        System.out.println(bst.search(root, 6));
//        System.out.println(bst.findMin(root));
//        System.out.println(bst.findMax(root));
        System.out.println(bst.findHeight(root));

        System.out.println(isBSTUtil(root, 0, 70));
    }

    public static boolean isBSTUtil(BstNode root, int min, int max) {

        if (root == null) return true;

        if (root.data >= min && root.data < max &&
                isBSTUtil(root.left, min, root.data)
                && isBSTUtil(root.right, root.data, max)) {
            return true;
        } else {
            return false;
        }
    }
}
