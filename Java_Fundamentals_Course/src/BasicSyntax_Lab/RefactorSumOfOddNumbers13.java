package BasicSyntax_Lab;

import java.util.Scanner;

public class RefactorSumOfOddNumbers13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = 2 * i +1;
            System.out.println(result);
            sum = sum + result;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
