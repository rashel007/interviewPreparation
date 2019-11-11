package DataStructure.stack_example;

public class MyStack {

    private int size = 4;
    private int stack[] = new int[4];
    private int top = -1;

    /**
     * This will push an element in the stack
     *
     * @param data integer type data
     */
    public void push(int data) {
        if (top < size - 1) {
            top++;
            stack[top] = data;
        } else {
            int temp[] = new int[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = stack[i];
            }
            stack = null;
            stack = temp;
            size = size * 2;
            top++;
            stack[top] = data;
        }
    }

    /**
     * This will remove an element from the top of the stack
     */
    public void pop() {
        if (top > -1)
            top--;
        else {
            System.out.println("Stack is empty");
        }
    }

    /**
     * This will remove the first element from the stack and return the removed item
     *
     * @return
     */
    public int popAndReturn() {
        if (top > -1) {
            int topData = stack[top];
            top--;
            return topData;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }

    }

    /**
     * This will return the top element of the stack
     *
     * @return integer value
     */
    public int top() {
        if (top == -1) {
            System.out.println("Empty Stack");
            return -1;
        }
        return stack[top];
    }

    /**
     * This will return the stack size
     *
     * @return int value
     */
    public int stacksize() {
        return size;
    }

    /**
     * This will return the current stack data size
     *
     * @return int value
     */
    public int size() {
        return top + 1;
    }
}
