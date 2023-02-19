package javaAdvanced.stacksAndQueues.main;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        String current = null;

        while(!input.equals("Home")){

            if(input.equals("back")){

                if(stack.isEmpty() || stack.size() == 1){

                    System.out.println("no previous URLs");

                    input = scanner.nextLine();
                    continue;
                }
                stack.pop();

            }else{
                stack.push(input);

            }
            System.out.println(stack.peek());

            input = scanner.nextLine();
        }


    }
}
