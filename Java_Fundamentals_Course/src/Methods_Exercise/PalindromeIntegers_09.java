package Methods_Exercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")){
            if (isPalindrome(input)){
                System.out.println("true");
                input= scanner.nextLine();
            }else {
                System.out.println("false");
                input= scanner.nextLine();
            }
        }

    }

    private static boolean isPalindrome(String input) {
        char currentSymbol = ' ';
        String revertedText = "";
        for (int i = 0; i < input.length(); i++) {
            currentSymbol = input.charAt(input.length() - 1 - i);
            revertedText =  revertedText + Character.toString(currentSymbol);
        }
        if (input.equals(revertedText)){
            return true;
        }else {
            return false;
        }

    }
}
