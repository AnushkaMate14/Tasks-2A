package DSA_50.StackQueue;

import java.util.*;

public class PostfixEvaluation_27 {

    public static void main(String[] args) {

        String expression = "23*54*+9-";

        Stack<Integer> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } 
            else {

                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {

                    case '+':
                        stack.push(a + b);
                        break;

                    case '-':
                        stack.push(a - b);
                        break;

                    case '*':
                        stack.push(a * b);
                        break;

                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        System.out.println(stack.pop());
    }
}