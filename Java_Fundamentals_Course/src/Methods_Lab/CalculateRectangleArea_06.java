package Methods_Lab;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        printRectangleArea(a, b);
    }

    private static void printRectangleArea(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }
}
