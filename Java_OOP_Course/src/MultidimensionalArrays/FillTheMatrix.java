package MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);
        int counter = 1;

        int[][] matrix = new int[size][size];

        if (input[1].equals("A")) {

            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    matrix[col][row] = counter;
                    counter++;

                }

            }

        } else if (input[1].equals("B")) {
            for (int col = 0; col < size; col++) {
                if (col % 2 == 0) {

                    for (int row = 0; row < size; row++) {
                        matrix[row][col] = counter;
                        counter++;
                    }
                } else {
                    for (int row = size - 1; row >= 0; row--) {
                        matrix[row][col] = counter;
                        counter++;
                    }

                }

            }


        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
