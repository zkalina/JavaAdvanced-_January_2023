package javaAdvanced.multidimensionalArrays.exercise;

import java.util.Scanner;

public class _2_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split(" ")[0]);
        int cols = Integer.parseInt(input.split(" ")[1]);

        String[][] matrix = new String[rows][cols];

        fillTheMatrix(matrix, rows, cols);

        printTheMatrix(matrix, rows, cols);
    }

    private static void printTheMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillTheMatrix(String[][] matrix, int rows, int cols) {
        char startLetter = 'a';
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String palindrome = "" + startLetter + (char)(startLetter + col) + startLetter;
                matrix[row][col] = palindrome;
            }
            startLetter = (char) (startLetter + 1);
        }

    }
}
