package DataStructure.Test;

public class TLinkedList {

    Node head;
    int size;

    public void insert(int data) {

        size++;
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        while (current != null && current.next != null) {
            current = current.next;
        }

        current.next = node;


    }

    public void insert(int data, int position) {

        if (position > size + 1) {
            System.out.println("Invalid Index");
        }


        Node node = new Node();
        node.data = data;


        if (head == null) {
            head = node;
        } else if (position == 1) {
            node.next = head;
            head = node;
        }

        Node current = head;
        int count = 1;
        while (count < position - 1) {
            current = current.next;
        }
    }

    public void show() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
