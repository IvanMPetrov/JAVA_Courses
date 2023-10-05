package BasicSyntax_Lab;

import java.util.Scanner;

public class SumOfOddNumbers09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum=0;
        int oddNumber = -1;

        for (int i = 1; i <= input ; i++) {
            oddNumber = oddNumber + 2;
            System.out.println(oddNumber);
            sum = sum + oddNumber;

        }

        System.out.printf("Sum: %d",sum );
    }
}
