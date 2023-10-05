package SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<Character, Integer> lettersMap = new TreeMap();

        String input = scanner.nextLine();

        for (int letter = 0; letter < input.length(); letter++) {

            char currentLetter = input.charAt(letter);
            lettersMap.putIfAbsent(currentLetter,0);

            int existingLetter = lettersMap.get(currentLetter);
            lettersMap.put(currentLetter,existingLetter + 1);

        }

        for (var element : lettersMap.entrySet()) {
            int value = element.getValue();

            System.out.println(element.getKey() + ": " + value + " time/s");

        }


    }
}
