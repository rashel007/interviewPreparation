package DataStructure.stack_example;

import DataStructure.stack_example.using_array.MyStackOfCharacter;

public class BalancedParentheses {


    public static void main(String[] args) {
        String example = "{(3{*4)+ 4{{}}";


        System.out.println(checkIfBalancedParentheses(example));

    }

    public static boolean checkIfBalancedParentheses(String value) {
        MyStackOfCharacter myStack = new MyStackOfCharacter();
        char[] exmCharArray = value.toCharArray();

        for (int i = 0; i < exmCharArray.length; i++) {

            if (exmCharArray[i] == '{' || exmCharArray[i] == '(' | exmCharArray[i] == '[') {
                myStack.push(exmCharArray[i]);
            } else if (exmCharArray[i] == '}' || exmCharArray[i] == ')' | exmCharArray[i] == ']') {
                if (myStack.isEmpty()) {
                    return false;
                } else if (isPair(myStack.top(), exmCharArray[i])) {
                    myStack.pop();
                }
            }
        }

        if (myStack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isPair(char opening, char closing) {

        if (opening == '(' && closing == ')') {
            return true;
        } else if (opening == '{' && closing == '}') {
            return true;
        } else if (opening == '[' && closing == ']') {
            return true;
        }

        return false;
    }
}
