package Methods_Lab;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.equals("int")){
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(num1,num2));
        }else if (input.equals("char")){
            char symbol1 = scanner.nextLine().charAt(0);
            char symbol2 = scanner.nextLine().charAt(0);
            System.out.println(getMax(symbol1,symbol2));

        }else if (input.equals("string")){
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();
            System.out.println(getMax(input1,input2));
        }
    }
    private static int getMax(int num1,int num2){
        if (num1 > num2){
            return num1;
        }else {
            return  num2;
        }
    }
    private static char getMax(char symbol1,char symbol2){
        if (symbol1 > symbol2){
            return symbol1;
        }else {
            return symbol2;
        }
    }
    private static String getMax(String input1,String input2){
        if (input1.compareTo(input2) > 0){
            return input1;
        }else {
            return input2;
        }
    }

}
