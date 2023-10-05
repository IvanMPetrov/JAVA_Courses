package ТextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            char processedSymbol = (char)(symbol + 3);
            sb.append(processedSymbol);
        }
        System.out.println(sb);
    }
}
