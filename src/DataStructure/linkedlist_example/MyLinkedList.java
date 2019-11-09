package DataStructure.linkedlist_example;

public class MyLinkedList {

    private Node head;
    private int size = 0;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            size++;
            head = node;
        } else {
            // traversal to the end of the node
            size++;
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }

            n.next = node;
        }
    }

    void show() {
        if (head == null) {
            System.out.println("No item found");
        }


        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;

        }
    }

    void insert(int data, int position) {
        if (position > size + 1) {
            System.out.println("Invalid Index");
            return;
        }

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            size++;
            head = node;
            return;
        } else if (position == 1) {
            node.next = head;
            head = node;
            return;
        }

        Node n = head;
        int count = 1;

        while (count < position - 1) {
            n = n.next;
            count++;
        }

        Node temp = n.next;
        n.next = node;
        node.next = temp;
        size++;


    }

    public int size() {
        return size;
    }
}
