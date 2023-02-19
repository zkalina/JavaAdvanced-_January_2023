package javaAdvanced.stacksAndQueues.exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class _4_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementsToAdd = scanner.nextInt();
        int elementsToRemove = scanner.nextInt();
        int elementToCheck = scanner.nextInt();

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < elementsToAdd; i++) {
            int number = scanner.nextInt();

            queue.offer(number);

        }
        for (int i = 0; i < elementsToRemove; i++){
            queue.poll();
        }

        if(!queue.isEmpty()){
            if(queue.contains(elementToCheck)){
                System.out.println("true");
            }else {
                System.out.println(Collections.min(queue));
            }
        }else{
            System.out.println("0");
        }
    }
}
