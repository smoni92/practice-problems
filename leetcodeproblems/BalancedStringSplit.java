package leetcodeproblems;

import java.util.Stack;

public class BalancedStringSplit {

    public static void main(String[] args) {

        int result = balancedStringSplit("RLLLLRRRLR");
        System.out.println("Result : " + result);
    }

    public static int balancedStringSplit(String s) {
        int result = 0;

        Stack<Character> stack = new Stack();

        for (Character ch : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() == ch)
                stack.push(ch);

            if (!stack.isEmpty() && stack.peek() != ch)
                stack.pop();

            if (stack.isEmpty())
                result++;
        }

        return result;
    }
}
