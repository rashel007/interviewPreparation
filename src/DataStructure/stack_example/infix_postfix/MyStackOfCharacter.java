package DataStructure.stack_example.infix_postfix;

public class MyStackOfCharacter {

    private int size = 4;
    private char stack[] = new char[4];
    private int top = -1;

    /**
     * This will push an element in the stack
     *
     * @param data integer type data
     */
    public void push(char data) {
        if (top < size - 1) {
            top++;
            stack[top] = data;
        } else {
            char temp[] = new char[size * 2];
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
    public char popAndReturn() {
        if (top > -1) {
            char topData = stack[top];
            top--;
            return topData;
        } else {
            System.out.println("Stack is empty");
            return ' ';
        }

    }

    /**
     * This will return the top element of the stack
     *
     * @return integer value
     */
    public char top() {
        if (top == -1) {
            System.out.println("Empty Stack");
            return ' ';
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

    /**
     * checks if stack is empty or nor
     *
     * @return boolean
     */
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }

        return false;
    }
}
