package javaAdvanced.multidimensionalArrays.exercise;

import java.util.Scanner;

public class _5_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dimensions = scanner.nextLine();
        int rows = Integer.parseInt(dimensions.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensions.split("\\s+")[1]);

        String[][] matrix = new String[rows][cols];
        fillTheMatrix(matrix, scanner);

        String input = scanner.nextLine();

        while(!input.equals("END")){
            String[] commandData = input.split("\\s+");
            String command = commandData[0];
            if(command.equals("swap")){
                if(commandData.length == 5){

                    int rowToSwap = Integer.parseInt(commandData[1]);
                    int colToSwap = Integer.parseInt(commandData[2]);
                    int replaceRow = Integer.parseInt(commandData[3]);
                    int replaceCol = Integer.parseInt(commandData[4]);

                    if(rowToSwap >= 0 && rowToSwap < rows && colToSwap >= 0 && colToSwap < cols &&
                            replaceRow >= 0 && replaceRow < rows && replaceCol >= 0 && replaceCol < cols){

                        String firstElement = matrix[rowToSwap][colToSwap];
                        String secondElement = matrix[replaceRow][replaceCol];
                        matrix[rowToSwap][colToSwap] = secondElement;
                        matrix[replaceRow][replaceCol] = firstElement;

                        printTheMatrix(matrix, rows, cols);
                    }else{
                        System.out.println("Invalid input!");
                    }
                }

            }else{
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine();
        }
    }

    private static void printTheMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillTheMatrix(String[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {

            matrix[i] = scanner.nextLine().split("\\s+");
        }
    }
}
