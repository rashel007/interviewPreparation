package DataStructure.stack_example.using_linkedlist;

public class Simulate {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.pop();
        myStack.pop();
        myStack.push(6);
        myStack.push(7);

//        System.out.println(myStack.size);
        System.out.println(myStack.top());
        myStack.print();

    }
}
