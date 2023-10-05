package Exam_Fundamentals.FinalExamFundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//


        int n = Integer.parseInt(scanner.nextLine());
        String regexWord = "^(\\$|%)(?<word>[A-Z][a-z]{3,})\\1: \\[(?<number1>[0-9]+)\\]\\|\\[(?<number2>[0-9]+)\\]\\|\\[(?<number3>[0-9]+)\\]\\|$";

        Pattern pattern = Pattern.compile(regexWord);


        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()){

                int number1 =Integer.parseInt(matcher.group("number1"));
                int number2 =Integer.parseInt(matcher.group("number2"));
                int number3 =Integer.parseInt(matcher.group("number3"));

                char symbol1 = (char) number1;
                char symbol2 = (char) number2;
                char symbol3 = (char) number3;
                String word = matcher.group("word");

                String letter = String.valueOf(symbol1)+String.valueOf(symbol2)+String.valueOf(symbol3);
                System.out.printf("%s: %s%n",word,letter);

            }else {
                System.out.println("Valid message not found!");
            }


        }

    }
}
