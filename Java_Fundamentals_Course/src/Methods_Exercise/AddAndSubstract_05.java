package Methods_Exercise;

import java.util.Scanner;

public class AddAndSubstract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());
        System.out.println(addAndSubstract(num1,num2,num3));
    }

    private static int addAndSubstract (int num1,int num2,int num3){
        int sum =0;
        sum = num1 + num2;
        sum = sum - num3;
        return sum;
    }
}
