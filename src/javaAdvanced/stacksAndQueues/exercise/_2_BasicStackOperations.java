package javaAdvanced.stacksAndQueues.exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class _2_BasicStackOperations {

    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);

        int pushElementsNum = scanner.nextInt();
        int popElementsNum = scanner.nextInt();
        int num = scanner.nextInt();

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < pushElementsNum; i++) {
            int numbers = scanner.nextInt();

            stack.push(numbers);
        }

        for (int i = 0; i < popElementsNum; i++) {
            stack.pop();
        }

        if(stack.contains(num)){
            System.out.println("true");
        }else{
            if(!stack.isEmpty()){
                System.out.println(Collections.min(stack));
            }else{
                System.out.println("0");
            }
        }
    }

}
