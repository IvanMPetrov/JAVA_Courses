package Methods_Lab;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printTriangle(n);


    }

    private static void printTriangle(int number) {
        int counter = 1;
        for (int rows = 1; rows <= number; rows++) {
            for (int i = 1; i <= rows; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int rows = number - 1; rows >= 1; rows--) {

            for (int i = rows; i >= 1; i--) {

                System.out.print(counter + " ");
                counter++;

            }
            System.out.println();
            counter = 1;
        }
    }
}

