package javaAdvanced.stacksAndQueues.practice;

import java.util.*;
import java.util.stream.Collectors;

public class _4_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            int element = input.charAt(i);
            if(element ==  '('){
                stack.push(i);

            }else if(element == ')'){
                int startIndex = stack.pop();
                String insideBrackets = input.substring(startIndex, i + 1);

                    System.out.println(insideBrackets);
                }

        }

    }
}
