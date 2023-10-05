package ТextProcessing;

import java.util.Scanner;

public class CharMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String str1 = input.split(" ")[0];
        String str2 = input.split(" ")[1];

        if (str1.length() > str2.length()) {
            int result = multiplyStrings(str1, str2);

            int longestString = str1.length() - str2.length();

            for (int i = str1.length() - 1; i > str1.length() - 1 - longestString; i--) {
                int symbol = str1.charAt(i);
                result = result + symbol;

            }
            System.out.println(result);
        } else {
            int result = multiplyStrings(str2, str1);

            int longestString = str2.length() - str1.length();

            for (int i = str2.length() - 1; i > str2.length() - 1 - longestString; i--) {
                int symbol = str2.charAt(i);
                result = result + symbol;
            }
            System.out.println(result);
        }
    }

    public static int multiplyStrings(String str1, String str2) {
        int result = 0;
        for (int i = 0; i < str2.length(); i++) {
            int symbol1 = str1.charAt(i);
            int symbol2 = str2.charAt(i);

            result = result + (symbol1 * symbol2);
        }
        return result;
    }
}
