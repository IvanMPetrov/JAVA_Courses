package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class SpecialNumbers_10 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int number = Integer.parseInt(scanner.nextLine());


    for (int i = 1; i <= number; i++) {
        int currentNum = i;
        int sum = 0;

        while (currentNum > 0) {
            sum = sum + (currentNum % 10);
            currentNum = currentNum / 10;

        }
        if (sum == 5 || sum == 7 || sum == 11){
            System.out.printf("%d -> True",i );
            System.out.println();
        }else {
            System.out.printf("%d -> False",i);
            System.out.println();
        }

    }

}
}
