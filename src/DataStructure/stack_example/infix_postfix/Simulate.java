package DataStructure.stack_example.infix_postfix;

public class Simulate {

    public static void main(String[] args) {

        String calculate = "A+B*C-D*E";
        String postfix = "";
        MyStackOfCharacter stack = new MyStackOfCharacter();

        char[] calculateToarray = calculate.toCharArray();

        for (int i = 0; i < calculateToarray.length; i++) {

            if (checkIfOperator(calculateToarray[i])) {

                if (stack.top() != ' ') {
                    while (stack.top() != ' ' && ischeckOperatorHigerorEqualOrder(calculateToarray[i], stack.top())) {
                        postfix = postfix + stack.popAndReturn();
                    }
                    stack.push(calculateToarray[i]);
                } else {
                    stack.push(calculateToarray[i]);
                }

            } else {
                postfix = postfix + calculateToarray[i] + "";
            }
        }

        while (stack.top() != ' ') {
            postfix = postfix + stack.popAndReturn();
        }


        System.out.println(postfix);


    }

    public static boolean checkIfOperator(char ch) {
        if (ch == '*' || ch == '/' || ch == '+' || ch == '-') {
            return true;
        }

        return false;
    }

    private static boolean ischeckOperatorHigerorEqualOrder(char current, char stackTop) {
        if (getOperatorPower(stackTop) >= getOperatorPower(current)) {
            return true;
        }

        return false;
    }

    private static int getOperatorPower(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        }
        if (ch == '*' || ch == '/') {
            return 2;
        }
        return -1;
    }
}
