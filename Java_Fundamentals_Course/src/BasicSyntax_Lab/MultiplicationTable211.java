package BasicSyntax_Lab;

import java.util.Scanner;

public class MultiplicationTable211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        int cicleTimes = 11 - multiplier;
        int multiply = multiplier;

        if (multiplier >= 10) {
            int calculate = input * multiplier;
            System.out.printf("%d X %d = %d", input, multiplier, calculate);
            return;
        }
        for (int i = 1; i <= cicleTimes; i++) {

            int calculate = input * multiply;

            System.out.printf("%d X %d = %d", input, multiply, calculate);
            System.out.println();
            multiply = multiply + 1;


        }
    }
}
