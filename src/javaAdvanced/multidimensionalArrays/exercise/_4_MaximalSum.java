package javaAdvanced.multidimensionalArrays.exercise;

import java.util.Scanner;

public class _4_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        fillTheMatrix(matrix, scanner);

        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;
        for (int row = 0; row < n - 2; row++) {
            for (int col = 0; col < m - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        +matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if(sum > maxSum){
                    maxSum = sum;
                    startRow = row;
                    startCol = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);

        for (int row = startRow; row <= startRow + 2; row++) {
            for (int col = startCol; col <= startCol + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
    }

    private static void fillTheMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = scanner.nextInt();

            }
        }
    }
}
