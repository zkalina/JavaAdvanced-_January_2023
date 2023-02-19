package javaAdvanced.multidimensionalArrays.exercise;

import java.util.Scanner;

public class _6_StringMatrixRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = input.split("[()]+")[0];
        int degrees = Integer.parseInt(input.split("[()]+")[1]) % 360;

//        char[][] matrix = new char[][];

//        matrixRotation(matrix);
//
//
//        printMatrix();

    }

    private static void matrixRotation(char[][] matrix) {


    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
              for (int row = 0; row < rows; row++) {
                  for (int col = 0; col < cols; col++) {
                      System.out.print(matrix[row][col] + " ");
                  }
                  System.out.println();
              }
          }
}
