package Exam_Fundamentals.FinalExamFundamentals;

import java.util.Locale;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//

        String words = scanner.nextLine();
        StringBuilder builder = new StringBuilder(words);


        String input = scanner.nextLine();

        while (!input.equals("Finish")) {

            String command = input.split(" ")[0];

            if (command.equals("Replace")) {

                String oldChar = input.split(" ")[1];
                String newChar = input.split(" ")[2];

                for (int i = 0; i < builder.length(); i++) {

                    if (words.split("")[i].equals(oldChar)) {
                        builder.deleteCharAt(i);
                        builder.insert(i, newChar);
                        words = builder.toString();
                    }
                }
                System.out.println(words);
//e do k
            } else if (command.equals("Cut")) {

                int start =Integer.parseInt(input.split(" ")[1]);
                int end =Integer.parseInt(input.split(" ")[2]);

                if (start > 0 && end < words.length()){
                    builder.delete(start,end +1);
                    words = builder.toString();

                    System.out.println(words);
                }else {
                    System.out.println("Invalid indices!");
                }

            } else if (command.equals("Make")) {
                command = input.split(" ")[1];

                if (command.equals("Upper")){
                    words = words.toUpperCase(Locale.ROOT);
                    builder = new StringBuilder(words);

                }else if (command.equals("Lower")){
                    words = words.toLowerCase(Locale.ROOT);
                    builder = new StringBuilder(words);
                }
                System.out.println(words);


            } else if (command.equals("Check")) {
                String textInput = input.split(" ")[1];

                if (words.contains(textInput)){
                    System.out.printf("Message contains %s%n",textInput);
                }else {
                    System.out.printf("Message doesn't contain %s%n",textInput);
                }

            } else if (command.equals("Sum")) {
                int start = Integer.parseInt(input.split(" ")[1]);
                int end = Integer.parseInt(input.split(" ")[2]);

                if (start > 0 && end < words.length()){
                    int sum = 0;
                    for (int i = start; i <= end ; i++) {
                        int symbol = words.charAt(i);
                        sum += symbol;

                    }
                    System.out.println(sum);
                }else {
                    System.out.println("Invalid indices!");
                }




            }
            input = scanner.nextLine();
        }

    }
}
