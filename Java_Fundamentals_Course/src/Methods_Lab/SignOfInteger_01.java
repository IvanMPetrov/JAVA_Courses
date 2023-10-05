package Methods_Lab;

import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        positiveOrNegative(n);

    }


    private static void positiveOrNegative (int num){
        if (num == 0){
            System.out.printf("The number 0 is zero.");
        }else if (num > 0){
            System.out.printf("The number %d is positive.",num);
        }else {
            System.out.printf("The number %d is negative.",num);
        }
    }

}
