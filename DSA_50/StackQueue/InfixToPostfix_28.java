package DSA_50.StackQueue;

import java.util.*;

public class InfixToPostfix_28 {

    static int priority(char ch) {

        if (ch == '+' || ch == '-')
            return 1;

        if (ch == '*' || ch == '/')
            return 2;

        if (ch == '^')
            return 3;

        return 0;
    }

    public static void main(String[] args) {

        String expression = "A+B*C";

        Stack<Character> stack = new Stack<>();
        String result = "";

        for (char ch : expression.toCharArray()) {

            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            } 
            else if (ch == '(') {
                stack.push(ch);
            } 
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }

                stack.pop();
            } 
            else {

                while (!stack.isEmpty() &&
                       priority(stack.peek()) >= priority(ch)) {

                    result += stack.pop();
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        System.out.println(result);
    }
}
