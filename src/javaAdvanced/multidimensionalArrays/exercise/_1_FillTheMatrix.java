package javaAdvanced.multidimensionalArrays.exercise;

import java.util.Scanner;

public class _1_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(input.split(", ")[0]);
        String pattern = input.split(", ")[1];
        int[][] matrix = new int[n][n];

        if(pattern.equals("A")){
            fillTheMatrixPatternA(matrix);
        }else if(pattern.equals("B")){
            fillTheMatrixPatternB(matrix);
        }
        printTheMatrix(matrix);

    }

    private static void printTheMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillTheMatrixPatternB(int[][] matrix) {
        int start = 1;
        for (int col = 0; col < matrix.length; col++) {
            if(col % 2 != 0){
            for (int row = matrix.length - 1; row >= 0; row--) {
                matrix[row][col] = start;
                start++;
            }
       }else {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = start;
                    start++;
                }

            }

        }
    }

    private static void fillTheMatrixPatternA(int[][] matrix) {
        int start = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = start;
                start++;
            }
        }
    }
}
