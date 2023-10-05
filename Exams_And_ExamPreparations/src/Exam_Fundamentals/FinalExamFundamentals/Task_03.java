package Exam_Fundamentals.FinalExamFundamentals;

import java.util.*;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//


        String text = scanner.nextLine();

        Map<String, List<String>> map = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();
        String[] arr = text.split(" \\| ");

        for (String symbol : arr) {
            String word = symbol.split(": ")[0];
            String info = symbol.split(": ")[1];

            if (!map.containsKey(word)) {

                map.putIfAbsent(word, new ArrayList<>());
                map.get(word).add(info);
                list.add(word);
            } else {
                map.get(word).add(info);
            }


        }

        String[] words = scanner.nextLine().split(" \\| ");
        String input = scanner.nextLine();
        if (input.equals("Test")) {

            for (int i = 0; i < 3; i++) {
                String currentWord = words[i];

                if (map.containsKey(currentWord)) {
                    if (map.get(currentWord).isEmpty()) {

                        continue;

                    } else {
                        System.out.println(currentWord + ":");
                        for (String entry : map.get(currentWord)) {
                            System.out.printf(" -%s%n", entry);
                        }

                    }
                }


            }


        } else if (input.contains("Hand Over")) {
            System.out.printf(String.join(" ", list));

        }


    }
}
