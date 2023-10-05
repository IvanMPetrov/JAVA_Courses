package Methods_Exercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= num; number++) {
            if (isDivisibleBy8(number) && isOdd(number)){
                System.out.println(number);
            }

        }

    }

    private static boolean isDivisibleBy8(int number) {
        int sumNum = 0;
        while (number > 0) {
            int currentNum = number % 10;
            sumNum += currentNum;
            number = number / 10;



        }
        if (sumNum % 8 == 0){
            return true;
        }
        return false;

    }

    private static boolean isOdd(int number) {
        while (number > 0) {
            int lastNum = number % 10;
            if (lastNum % 2 == 1){
                return true;
            }
            number = number / 10;
        }
        return false;
    }

}

