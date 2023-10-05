package BasicSyntax_Exercise;

import java.util.Scanner;

public class Orders_09 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int countOrders = Integer.parseInt(scanner.nextLine());
    double totalPrice = 0;
    double price = 0;

    for (int i = 0; i < countOrders; i++) {
        double capsulePrice = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int capsulesCount = Integer.parseInt(scanner.nextLine());

        totalPrice = ((days * capsulesCount) * capsulePrice);
        System.out.printf("The price for the coffee is: $%.2f", totalPrice);
        System.out.println();
        price = price + totalPrice;

    }
    System.out.printf("Total: $%.2f",price);



}
}
