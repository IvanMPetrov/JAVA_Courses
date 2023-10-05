package StreamsDirectories;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacters_04 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/input.txt"));
        PrintWriter printWriter = new PrintWriter(new FileWriter("resources/output.txt"));


        String line = bufferedReader.readLine();
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Vowels", 0);
        map.put("Consonants", 0);
        map.put("Punctuation", 0);

        while (line != null) {

            for (char symbol : line.toCharArray()) {

                if (isVowel(symbol)) {

                    int currentSum = map.get("Vowels");
                    map.put("Vowels", currentSum + 1);
                } else if (isPunctuation(symbol)) {
                    int currentSum = map.get("Punctuation");
                    map.put("Punctuation", currentSum + 1);
                } else if (symbol == ' ') {
                    continue;
                } else {
                    int currentSum = map.get("Consonants");
                    map.put("Consonants", currentSum + 1);
                }
            }
            line = bufferedReader.readLine();
        }
        for (String element :map.keySet()) {

            int currentElement = map.get(element);
            printWriter.print(element + ": " + currentElement);
            printWriter.println();
        }
        printWriter.close();
        bufferedReader.close();

    }

    private static boolean isPunctuation(char symbol) {
        return symbol == '!' || symbol == '?' || symbol == '.' || symbol == ',';
    }

    private static boolean isVowel(char symbol) {
        return symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u';
    }
}
