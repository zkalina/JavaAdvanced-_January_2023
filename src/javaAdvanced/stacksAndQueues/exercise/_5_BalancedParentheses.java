package javaAdvanced.stacksAndQueues.exercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _5_BalancedParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");
        Deque<String> stack = new ArrayDeque<>();
        Deque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            String parenthesis = input[i];

            if (parenthesis.equals("(") || parenthesis.equals("{") || parenthesis.equals("[")){

                stack.push(parenthesis);

            }else if (parenthesis.equals(")") || parenthesis.equals("}") || parenthesis.equals("]")){

                queue.offer(parenthesis);
            }

        }

        if(!stack.isEmpty() && !queue.isEmpty()) {

            String openBracket = stack.pop();
            String closeBracket = queue.poll();

            if (openBracket.equals("(") && closeBracket.equals(")")
                    || openBracket.equals("{") && closeBracket.equals("}")
                    || openBracket.equals("[") && closeBracket.equals("]")) {

                System.out.println("YES");

            } else {

                System.out.println("NO");
            }
        }
    }
}
