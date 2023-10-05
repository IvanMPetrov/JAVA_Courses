package Methods_Lab;

import java.util.Scanner;

public class RepeatingString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int times = Integer.parseInt(scanner.nextLine());
        printText(input,times);

    }

    private static void printText(String input, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.print(input);

        }
    }
}
