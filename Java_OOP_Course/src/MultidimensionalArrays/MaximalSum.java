package MultidimensionalArrays;

import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            input = scanner.nextLine().split(" ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int rowIndex = 0;
        int colIndex = 0;

        for (int row = 0; row < rows - 2; row++) {

            for (int col = 0; col < cols - 2; col++) {

                currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +

                        matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +

                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);

        for (int i = rowIndex; i < rowIndex + 3 ; i++) {

            for (int j = colIndex; j < colIndex + 3 ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
