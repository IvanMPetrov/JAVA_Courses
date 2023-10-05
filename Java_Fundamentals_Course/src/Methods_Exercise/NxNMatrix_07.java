package Methods_Exercise;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        printBoxOfNumber(number);
    }
    private static void printBoxOfNumber (int number){
        for (int rows = 1; rows <=number ; rows++) {
            for (int times = 1; times <=number ; times++) {
                System.out.print(number + " ");

            }
            System.out.println();

        }
    }
}
