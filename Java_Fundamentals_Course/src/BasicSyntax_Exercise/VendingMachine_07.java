package BasicSyntax_Exercise;

import java.util.Scanner;

public class VendingMachine_07 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    double insertedMoney = 0;
    double totalMoney = 0;
    String product = "";

    while (true){
        if (!input.equals("Start")){
            insertedMoney = Double.parseDouble(input);
        }else {
            break;
        }
        if      ((insertedMoney == 0.1
                || insertedMoney == 0.2
                || insertedMoney == 0.5
                || insertedMoney == 1
                || insertedMoney == 2)){

            totalMoney = totalMoney + insertedMoney;
            input = scanner.nextLine();

        } else {
            System.out.printf("Cannot accept %.2f",insertedMoney);
            System.out.println();
            input = scanner.nextLine();
        }
    }
    input = scanner.nextLine();
    while (!input.equals("End")){
        if (input.equals("Nuts")){
            if (totalMoney >= 2){
                totalMoney = totalMoney - 2;
                System.out.println("Purchased Nuts");
                input = scanner.nextLine();
            }else {
                System.out.println("Sorry, not enough money");
                input = scanner.nextLine();
            }


        } else if (input.equals("Water")){
            if (totalMoney >= 0.7){
                totalMoney = totalMoney - 0.7;
                System.out.println("Purchased Water");
                input = scanner.nextLine();
            }else {
                System.out.println("Sorry, not enough money");
                input = scanner.nextLine();
            }


        }else if (input.equals("Crisps")){
            if (totalMoney >= 1.5){
                totalMoney = totalMoney - 1.5;
                System.out.println("Purchased Crisps");
                input = scanner.nextLine();
            }else {
                System.out.println("Sorry, not enough money");
                input = scanner.nextLine();
            }


        }else if (input.equals("Soda")){
            if (totalMoney >= 0.8){
                totalMoney = totalMoney - 0.8;
                System.out.println("Purchased Soda");
                input = scanner.nextLine();
            }else {
                System.out.println("Sorry, not enough money");
                input = scanner.nextLine();
            }


        }else if (input.equals("Coke")){
            if (totalMoney >= 1){
                totalMoney = totalMoney - 1.0;
                System.out.println("Purchased Coke");
                input = scanner.nextLine();
            }else {
                System.out.println("Sorry, not enough money");
                input = scanner.nextLine();
            }

        }else {
            System.out.println("Invalid product");
            input = scanner.nextLine();
        }

    }
    System.out.printf("Change: %.2f",totalMoney);

}
}
