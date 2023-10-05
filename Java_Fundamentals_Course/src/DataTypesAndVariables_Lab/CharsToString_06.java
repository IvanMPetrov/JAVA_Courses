package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class CharsToString_06 {public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    char firstLet = scanner.nextLine().charAt(0);
    char secondLet = scanner.nextLine().charAt(0);
    char thirdLet = scanner.nextLine().charAt(0);

    System.out.printf("%c%c%c",firstLet,secondLet,thirdLet);

}
}
