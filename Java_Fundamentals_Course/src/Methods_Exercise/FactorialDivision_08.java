package Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long fact1 = factorialCalculationAndDividing(number);
        long fact2 = factorialCalculationAndDividing(number2);
        double sum = fact1 * 1.0/ fact2;

        System.out.printf("%.2f",sum);


    }

    private static long factorialCalculationAndDividing(int number) {
        long sum = 1;
        for (int i = 1; i <= number; i++) {
            sum = sum * i;
        }

        return sum;
    }
}
