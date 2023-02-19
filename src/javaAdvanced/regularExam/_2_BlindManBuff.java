package javaAdvanced.regularExam;

import java.util.Scanner;

public class _2_BlindManBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[rows][cols];

        fillMatrix(matrix, scanner);

        int currentRow = 0;
        int currentCol = 0;

        String symbolToMove = "B";

        String input = scanner.nextLine();

        while(!input.equals("Finish")){
           if(input.equals("up")){
                currentRow--;

           }else if(input.equals("down")){
            currentRow++;

           }else if(input.equals("right")){
                currentCol++;

           }else if(input.equals("left")){
            currentCol--;
           }


            input = scanner.nextLine();
        }

        printMatrix(matrix, rows, cols);
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
                matrix[row] = scanner.nextLine().split("\\s+");
        }
    }
}
