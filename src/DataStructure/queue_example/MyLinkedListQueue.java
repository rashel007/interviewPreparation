package DataStructure.queue_example;

public class MyLinkedListQueue {

    private QueueNode head = null;
    private QueueNode tail = null;


    void enqueue(int data) {

        QueueNode node = new QueueNode();
        node.data = data;

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = node;

    }

    void dequeue() {
        if (head == null) {
            System.out.println("Queue is Empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }


    }

    public int getHead() {
        if (head != null) {
            return head.data;
        }

        return -1;
    }

    public int getTail() {
        if (tail != null) {
            return tail.data;
        }

        return -1;
    }

    public void showAll() {

        if (head == null) {
            System.out.println("Empty Queue");
            return;
        }

        QueueNode temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }


    }


}
