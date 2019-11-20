package DataStructure.queue_example;

public class Simulate {

    public static void main(String[] args) {

        MyLinkedListQueue queue = new MyLinkedListQueue();

        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.getHead());
        System.out.println(queue.getTail());
        queue.showAll();
    }
}
