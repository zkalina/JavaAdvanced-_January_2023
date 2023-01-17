package javaAdvanced.stacksAndQueues.practice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _1_BrowserHistory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();

        String currentBrowser = "";

        while(!input.equals("Home")){

            if(input.equals("back")){
                if(!stack.isEmpty()){
                    currentBrowser = stack.pop();
                }else{
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }

            }else{
                 if(!currentBrowser.isEmpty()){
                     stack.push(currentBrowser);
                 }
                 currentBrowser = input;
            }
            System.out.println(currentBrowser);

            input = scanner.nextLine();
        }
    }
}
