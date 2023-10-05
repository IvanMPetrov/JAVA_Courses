package MultidimensionalArrays;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                char outsideLetter = (char) ('a' + row);
                char insideLetter = (char) ('a' + row + col);


                matrix[row][col] = String.valueOf(outsideLetter) + insideLetter + outsideLetter + "";
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
