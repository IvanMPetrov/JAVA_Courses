package Methods_Lab;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int num2 = Integer.parseInt(scanner.nextLine());
        double result = calculation(num1,operator,num2);
        System.out.printf("%.0f",result);


    }
    private static double calculation(int num1,char operator,int num2){
        double result=0;
        switch (operator){
            case '-':
                result = num1 - num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 * 1.0 / num2;
                break;
        }
        return result;
    }
}
