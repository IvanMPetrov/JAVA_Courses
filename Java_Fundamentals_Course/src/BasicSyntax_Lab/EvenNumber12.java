package BasicSyntax_Lab;

import java.util.Scanner;

public class EvenNumber12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenNumber = Integer.parseInt(scanner.nextLine());
        while (true) {
            if (evenNumber % 2 == 0) {
                System.out.println("The number is: " + Math.abs(evenNumber));
                return;
            } else {
                System.out.println("Please write an even number.");
                evenNumber = Integer.parseInt(scanner.nextLine());
            }


        }
    }
}
