package Methods_Exercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printMiddleLetter(input);

    }
    private static void printMiddleLetter (String input){
        int length = input.length();
        if (length % 2 == 0) {
            char letter1 = input.charAt(length / 2 - 1);
            char letter2 = input.charAt(length / 2);
            System.out.println(letter1+""+letter2);

        } else {
            char letter = input.charAt(length / 2);

            System.out.println(letter);
        }
    }
}
