package Methods_Exercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int result = vowelsCount(input);
        System.out.println(result);


    }

    private static int vowelsCount(String input) {
        String lowLetterCase = input.toLowerCase(Locale.ROOT);
        int counter = 0;
        for (int i = 0; i <= lowLetterCase.length() - 1; i++) {
            char currentSymbol = lowLetterCase.charAt(i);//a o u e i
            if (currentSymbol == 'a'
               || currentSymbol == 'o'
               || currentSymbol == 'u'
               || currentSymbol == 'e'
                || currentSymbol == 'i' ){
                counter++;

            }

        }
        return counter;

    }
}
