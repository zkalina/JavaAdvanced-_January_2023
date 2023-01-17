package javaAdvanced.stacksAndQueues.practice;

import java.util.*;

public class _2_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = Arrays.asList(scanner.nextLine().split(" "));

        Deque<String> stack = new ArrayDeque<>();

        int result;

        stack.addAll(data);
        Collections.reverse(data);

                while(stack.size() > 1){

                        int first = Integer.parseInt(stack.pop());
                        String operator = stack.pop();
                        int second = Integer.parseInt(stack.pop());

                        if(operator.equals("+")){
                            result = first + second;
                        }else {
                            result = first - second;
                        }

                        stack.push(result + "");
                    }

                    System.out.println(stack.peek());


                }
            }
