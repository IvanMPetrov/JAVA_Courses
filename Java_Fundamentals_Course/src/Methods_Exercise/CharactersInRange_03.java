package Methods_Exercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        printSymbolsInbetwin(symbol1,symbol2);

    }

    private static void printSymbolsInbetwin(char symbol1, char symbol2) {
        if (symbol1 > symbol2) {
            for (int i = symbol2 + 1; i < symbol1; i++) {
                char currentSymbol=(char)i;
                System.out.print(currentSymbol + " ");
            }
        } else {
            for (int i = symbol1 + 1; i < symbol2; i++) {
                char currentSymbol=(char)i;
                System.out.print(currentSymbol + " ");
            }

        }
    }
}
