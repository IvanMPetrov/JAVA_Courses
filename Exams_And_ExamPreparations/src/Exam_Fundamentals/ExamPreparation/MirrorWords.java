package Exam_Fundamentals.ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(@|#)(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> matchingWordsList = new ArrayList<>();
        int counter = 0;

        while (matcher.find()){
            String firstWord = matcher.group("first");
            String secondWord = matcher.group("second");
            StringBuilder stringBuilder = new StringBuilder(secondWord);
            String reversedWord = stringBuilder.reverse().toString();
            counter++;
            if (firstWord.equals(reversedWord)){

                matchingWordsList.add(firstWord + " <=> " + secondWord);

            }
        }

        System.out.printf("%d word pairs found!%n",counter);
        System.out.println("The mirror words are:");

        for (String s : matchingWordsList) {
            System.out.printf("%s, ",s);
        }




    }
}
