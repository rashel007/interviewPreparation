package DataStructure.queue_example;

public class MyQueue {

    int ARRAY_SIZE = 10;
    int front, rear;

    MyQueue() {
        front = -1;
        rear = -1;
    }

    int array[] = new int[ARRAY_SIZE];

    boolean isFull() {

        return (rear + 1) % ARRAY_SIZE == front ? true : false;
    }

    boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else {
            return false;
        }
    }


    public void enqueue(int number) {

        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % ARRAY_SIZE;
        }

        array[rear] = number;
    }

    public void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        } else if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % ARRAY_SIZE;
        }


    }

    public int Front() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }

        return array[front];
    }

    void showAll() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        do {
            System.out.println(" " + array[i]);
            i = ++i % ARRAY_SIZE;
        } while (i != rear + 1);
    }
}

