package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class PoundsToDollars_02 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double britishPound = 1.36;
    double dollars = Double.parseDouble(scanner.nextLine());
    double result = britishPound * dollars;
    System.out.printf("%.3f",result);


}
}
