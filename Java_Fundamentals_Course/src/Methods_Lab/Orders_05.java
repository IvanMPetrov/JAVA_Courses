package Methods_Lab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        printCalcEndPrice(input,quantity);


    }

    private static void printCalcEndPrice(String input, int quantity) {
        double coffee = 1.50;
        double water = 1.00;
        double coke = 1.40;
        double snacks = 2.00;
        double result = 0;

        if (input.equals("coffee")) {
            result = coffee * quantity;
            System.out.printf("%.2f",result);

        } else if (input.equals("water")) {
            result = water * quantity;
            System.out.printf("%.2f",result);

        } else if (input.equals("coke")) {
            result = coke * quantity;
            System.out.printf("%.2f",result);

        } else if (input.equals("snacks")) {
            result = snacks * quantity;
            System.out.printf("%.2f",result);
        }
    }
}
