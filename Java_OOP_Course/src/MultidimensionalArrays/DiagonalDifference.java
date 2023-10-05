package MultidimensionalArrays;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsAndCols = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rowsAndCols][rowsAndCols];

        for (int row = 0; row < rowsAndCols; row++) {
            String[] input = scanner.nextLine().split(" ");

            for (int col = 0; col < rowsAndCols; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }

        int main = 0;
        int secondary = 0;

        for (int row = 0; row < rowsAndCols; row++) {
            for (int col = 0; col < rowsAndCols; col++) {

                if (row == col) {
                    main += matrix[row][col];
                }
            }
        }

        for (int row = 0, col = rowsAndCols - 1; row < rowsAndCols && col >= 0; col--, row++) {

            secondary += matrix[col][row];
        }

        System.out.println(Math.abs(main - secondary));


    }
}
