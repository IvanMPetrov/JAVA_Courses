package Methods_Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(smallestOfThree(num1,num2,num3));


    }

    private static int smallestOfThree(int num1, int num2, int num3){
        if (num1 < num2 && num1 < num3){
            return num1;
        }else if (num2 < num1 && num2 < num3){
            return num2;
        }else {
            return num3;
        }
    }
}
