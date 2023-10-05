package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class ConcatNames_05 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String firstName = scanner.nextLine();
    String SecondName = scanner.nextLine();
    String delimiter = scanner.nextLine();
    String end = "";


    for (int position = 0; position <= delimiter.length() -1 ; position++) {
        char symbol = delimiter.charAt(position);
        end = end + symbol;
    }

    System.out.printf("%s%s%s",firstName,end,SecondName);


}
}
