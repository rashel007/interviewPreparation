package DataStructure.linkedlist_example;

public class MyLinkedList {

    private Node head;
    private int size = 0;

    /**
     * insert by auto position at end each time
     *
     * @param data int item to be inserted in list
     */
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

    /**
     * to insert a node at position
     *
     * @param data     int value to be inserted
     * @param position the position node should be inserted. it should be 1 or above
     */
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

    /**
     * to delete a node from list
     *
     * @param position should be 1 or above
     */
    public void delete(int position) {
        if (position < 1 || position >= size + 1) {
            System.out.println("Index out of bound");
            return;
        }

        int count = 1;
        Node current = head;
        Node previous = null;
        while (count < position) {
            previous = current;
            current = current.next;
            count++;
        }
        if (previous == null) {
            head = head.next;
        } else {
            previous.next = current.next;
        }

        previous = null;
        current = null;


    }

    public int size() {
        return size;
    }
}
