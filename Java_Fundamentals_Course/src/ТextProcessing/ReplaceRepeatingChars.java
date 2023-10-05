package ТextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Character> taken = new ArrayList<>();

        taken.add(input.charAt(0));
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            for (int j = 0; j < taken.size(); j++) {

                int lastLetterNum = taken.size() - 1;
                char lastLetter = taken.get(lastLetterNum);

                if (symbol != lastLetter || !taken.contains(symbol)) {

                    taken.add(symbol);
                    continue;
                } else {
                    continue;
                }
            }
        }
        String output = "";
        for (Character character : taken) {
            output = output + character;
        }
        System.out.println(output);
    }
}
