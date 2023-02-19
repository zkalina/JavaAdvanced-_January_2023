package javaAdvanced.multidimensionalArrays.exercise;

import java.util.Scanner;

public class _3_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

            fillTheMatrix(matrix, scanner);

           int primaryDiagonalSum =  primaryDiagonalSum(matrix);
           int secondaryDiagonalSum =  secondaryDiagonalSum(matrix);

        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));


    }

    private static int secondaryDiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if(col == matrix.length - row - 1){
                    sum += matrix[row][col];
                }
            }
        }

        return sum;
    }

    private static int primaryDiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row< matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if(row == col){
                    sum += matrix[row][col];
                }
            }
        }
        return sum;

    }

    private static void fillTheMatrix(int[][] matrix, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }


}
