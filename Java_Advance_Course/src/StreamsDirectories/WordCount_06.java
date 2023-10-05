package StreamsDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount_06 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("resources/words.txt"));
        String[] input = reader.readLine().split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s : input) {
            map.put(s, 0);
        }
        Scanner wordScanner = new Scanner(new FileReader("resources/text.txt"));

        String singleWord = wordScanner.next();

        while (wordScanner.hasNext()){


            if (map.containsKey(singleWord)){
                int currentSum = map.get(singleWord);
                map.put(singleWord,currentSum + 1);
            }
            singleWord = wordScanner.next();
        }
        PrintWriter printWriter = new PrintWriter("resources/results.txt");

        for (String element: map.keySet()) {

            int sum = map.get(element);
            printWriter.println(element + " - " + sum);
        }
        printWriter.close();
        reader.close();
    }
}
