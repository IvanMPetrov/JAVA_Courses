package ТextProcessing;

import java.util.Scanner;


public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder builder = new StringBuilder(input);

        int totalPower = 0;
        for (int i = 0; i < builder.length(); i++) {
            char symbol = builder.charAt(i);

            if (symbol == '>') {
                int currentPower = Integer.parseInt(builder.charAt(i + 1) + "");
                totalPower += currentPower;
            } else if (symbol != '>' && totalPower > 0) {
                builder.deleteCharAt(i);
                totalPower--;
                i--;
            }
        }
        System.out.println(builder);


    }
}
