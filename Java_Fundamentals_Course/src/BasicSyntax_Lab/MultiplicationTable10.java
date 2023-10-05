package BasicSyntax_Lab;

import java.util.Scanner;

public class MultiplicationTable10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int multiply = 1;
        for (int i = 1; i <= 10; i++) {

            int calculate = input * multiply;

            System.out.printf("%d X %d = %d",input,multiply,calculate);
            System.out.println();
            multiply = multiply + 1;


        }
    }
}
