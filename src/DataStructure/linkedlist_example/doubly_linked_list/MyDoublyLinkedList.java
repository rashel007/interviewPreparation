package DataStructure.linkedlist_example.doubly_linked_list;

public class MyDoublyLinkedList {


    private Node head;
    private int size = 0;


    public int size() {
        return size;
    }

    public void insert(int data) {

        Node node = new Node();
        node.data = data;

        if (head == null) {
            node.next = null;
            node.prev = null;
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;

        }

        size++;
    }

    public void show() {

        if (head == null) {
            System.out.println("Empty Body");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }


    /**
     * @param data     int data
     * @param position at position (should be 1 or above)
     */
    public void insert(int data, int position) {

        if (position < 1 || position > size + 1) {
            System.out.println("Invalid Index");
            return;
        }

        size++;

        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
            return;
        }


        Node current = head;


        if (position == 1) {
            current.prev = newNode;
            newNode.next = current;
            head = newNode;
            return;
        }


        int count = 1;
        while (count < position - 1) {
            count++;
            current = current.next;
        }

        Node next = current.next;

        current.next = newNode;
        newNode.prev = current;
        if (next != null) {
            newNode.next = next;
            next.prev = newNode;
        }


    }

}
