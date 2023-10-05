package Methods_Lab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        calculated(input,num1,num2);

    }

    private static void calculated(String input, int num1, int num2) {
        int result = 0;
        if (input.equals("add")) {
            result = num1 + num2;
            System.out.print(result);
        } else if (input.equals("multiply")) {
            result = num1 * num2;
            System.out.print(result);
        } else if (input.equals("substract")) {
            result = num1 - num2;
            System.out.print(result);
        } else if (input.equals("divide")) {
            result = num1 / num2;
            System.out.print(result);
        }

    }

}
