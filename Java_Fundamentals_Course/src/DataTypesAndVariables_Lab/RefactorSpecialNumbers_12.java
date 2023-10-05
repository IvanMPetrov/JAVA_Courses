package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    int numberInput = Integer.parseInt(scanner.nextLine());

    int currentNumber = 0;
    int sum = 0;
    boolean flag = false;

    for (int startingNumber = 1; startingNumber <= numberInput; startingNumber++) {
        currentNumber = startingNumber;

        while (startingNumber > 0) {
            sum += startingNumber % 10;
            startingNumber = startingNumber / 10;
        }

        flag = (sum == 5) || (sum == 7) || (sum == 11);
        if (flag){
            System.out.printf("%d -> True%n", currentNumber);
        }else {
            System.out.printf("%d -> False%n", currentNumber);
        }


        sum = 0;
        startingNumber = currentNumber;
    }


}
}
