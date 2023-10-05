package BasicSyntax_Exercise;

import java.util.Scanner;

public class TriangleOfNumbers_08 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = Integer.parseInt(scanner.nextLine());

    for (int rolls = 1; rolls <= number ; rolls++) {
        for (int i = 1; i <=rolls ; i++) {
            System.out.print(rolls+" ");

        }
        System.out.println();
    }

}
}
