package BasicSyntax_Exercise;

import java.util.Scanner;

public class Vacation_03 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numberOfPeople = Integer.parseInt(scanner.nextLine());
    String typePerson = scanner.nextLine();
    String day = scanner.nextLine();

    if (typePerson.equals("Business") && numberOfPeople >= 100) {
        numberOfPeople = numberOfPeople - 10;
    }

    double totalSum = 0;
    double discount = 0;

    if (typePerson.equals("Students")) {

        if (day.equals("Friday")) {
            totalSum = 8.45 * numberOfPeople;

        } else if (day.equals("Saturday")) {
            totalSum = 9.80 * numberOfPeople;

        } else if (day.equals("Sunday")) {
            totalSum = 10.46 * numberOfPeople;
        }

    } else if (typePerson.equals("Business")) {

        if (day.equals("Friday")) {
            totalSum = 10.90 * numberOfPeople;
            System.out.printf("Total price: %.2f",totalSum);
            return;

        } else if (day.equals("Saturday")) {
            totalSum = 15.60 * numberOfPeople;
            System.out.printf("Total price: %.2f",totalSum);
            return;

        } else if (day.equals("Sunday")) {
            totalSum = 16 * numberOfPeople;
            System.out.printf("Total price: %.2f",totalSum);
            return;

        }

    } else if (typePerson.equals("Regular")) {

        if (day.equals("Friday")) {
            totalSum = 15 * numberOfPeople;
        } else if (day.equals("Saturday")) {
            totalSum = 20 * numberOfPeople;
        } else if (day.equals("Sunday")) {
            totalSum = 22.50 * numberOfPeople;
        }

    }
    if (numberOfPeople >= 30 && typePerson.equals("Students")) {
        discount = totalSum * 0.85;
        System.out.printf("Total price: %.2f",discount);
        return;
    } else if (typePerson.equals("Regular") && numberOfPeople >= 10 && numberOfPeople <= 20) {
        discount = totalSum * 0.95;
        System.out.printf("Total price: %.2f",discount);
        return;
    }
    System.out.printf("Total price: %.2f",totalSum);

}
}
