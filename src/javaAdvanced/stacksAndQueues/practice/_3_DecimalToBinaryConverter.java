package javaAdvanced.stacksAndQueues.practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _3_DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNumber = Integer.parseInt(scanner.nextLine());

        Deque<Integer> binary = new ArrayDeque<>();
        int result;

        if(decimalNumber == 0){
            System.out.println("0");
            return;
        }

        while(decimalNumber > 0){

            result = decimalNumber % 2;

            binary.push(result);

            decimalNumber /= 2;

        }


           while(!binary.isEmpty()){
                System.out.print(binary.pop());

        }
    }
}
