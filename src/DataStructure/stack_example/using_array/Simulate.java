package DataStructure.stack_example.using_array;

public class Simulate {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.push(5);

        System.out.println("Top: " + stack.top());
        System.out.println("Stack: " + stack.stacksize());
        System.out.println("Stack Data: " + stack.size());
        System.out.println(stack.popAndReturn());
        System.out.println(stack.popAndReturn());
        System.out.println(stack.popAndReturn());
        System.out.println(stack.popAndReturn());

    }
}
