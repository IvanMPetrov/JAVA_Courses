package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters_06 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int input = Integer.parseInt(scanner.nextLine());

    for (char i = 'a'; i <'a'+ input; i++) {
        for (int j = 'a'; j <'a'+ input ; j++) {
            for (int k = 'a'; k <'a'+input ; k++) {
                System.out.printf("%c%c%c%n",i,j,k);
            }
        }

    }
}
}
