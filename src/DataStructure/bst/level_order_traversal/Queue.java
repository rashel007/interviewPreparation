package DataStructure.bst.level_order_traversal;


public class Queue {

    Node head;
    Node tail;

    public void insert(BstNode data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = node;
    }

    public void pop() {
        if (head == null) {
            System.out.println("Empty Queue");
        }

        if (head.next != null) {
            head = head.next;
        } else {
            head = null;
            tail = null;
        }
    }

    public BstNode front() {
        return head.data;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }

        return false;
    }

}
