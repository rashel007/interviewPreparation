package DataStructure.bst.level_order_traversal;


public class LevelOrderTraversal {

    public static void main(String[] args) {
        BST bst = new BST();

        BstNode root = null;

        root = bst.insert(root, 10);
        root = bst.insert(root, 5);
        root = bst.insert(root, 4);
        root = bst.insert(root, 6);
        root = bst.insert(root, 8);
        root = bst.insert(root, 7);
        root = bst.insert(root, 20);
        root = bst.insert(root, 30);
        root = bst.insert(root, 15);
        root = bst.insert(root, 40);
        root = bst.insert(root, 25);

        simulateLOS(root);

        System.out.println("After Delete");

        root = bst.deleteNode(root, 20);
        root = bst.deleteNode(root, 7);

        simulateLOS(root);


    }

    private static void simulateLOS(BstNode root) {


        if (root == null) return;

        Queue queue = new Queue();


        queue.insert(root);

        while (!queue.isEmpty()) {

            BstNode current = queue.front();
            System.out.println(current.data);

            if (current.left != null) {
                queue.insert(current.left);
            }
            if (current.right != null) {
                queue.insert(current.right);
            }

            queue.pop();
        }
    }

}
