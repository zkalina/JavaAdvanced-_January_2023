package javaAdvanced.stacksAndQueues.exercise;

import java.util.*;

public class _3_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsNumber = Integer.parseInt(scanner.nextLine());

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= commandsNumber; i++) {
            String data = scanner.nextLine();
            String command = data.split(" ")[0];

            switch (command){
                case "1":
                    int numberToPush = Integer.parseInt(data.split(" ")[1]);
                    stack.push(numberToPush);
                    break;

                case "2":
                    if(!stack.isEmpty()){
                        stack.pop();
                    }

                    break;

                case "3":
                    if(!stack.isEmpty()){
                        System.out.println(Collections.max(stack));
                    }
                    break;
            }
        }
    }
}
