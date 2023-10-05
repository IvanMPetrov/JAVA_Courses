package Methods_Lab;

import java.util.Scanner;

public class MultiplyEvenByOdd_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int result = evenNums(input,number);
        System.out.println(result);
    }
    private static int evenNums(String input, int number) {
        int even = 0;
        int odd = 0;
        int numParts = 0;
        for (int i = 0; i <= input.length() - 1; i++) {
            numParts = number % 10;
            if (numParts % 2 == 0) {
                even = even + numParts;
            } else {
                odd = odd + numParts;
            }
            number = number / 10;
        }
        return even * odd;
    }
}
