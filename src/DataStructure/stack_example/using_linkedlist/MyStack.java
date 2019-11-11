package DataStructure.stack_example.using_linkedlist;

public class MyStack {

    private Node head;

    int size = 0;


    public void push(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            node.next = null; // this line is just for clarity
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void pop() {
        if (head == null) {
            System.out.println("Empty Stack");
            return;
        }

        Node temp = head.next;
        head = null;
        head = temp;
        size--;
    }

    public int top() {
        if (head == null) {
            System.out.println("Empty Stack");
            return -1;
        }

        return head.data;
    }

    public void print() {
        if (head == null) {
            System.out.println("Empty Stack");
            return;
        }

        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
