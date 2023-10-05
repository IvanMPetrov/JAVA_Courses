package StacksAndQueue_First;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (decimal == 0){
            System.out.println(decimal);
            return;
        }

        while (decimal != 0){

            stack.push(decimal % 2);
            decimal /= 2;

        }

        while (!stack.isEmpty()){
            int result = stack.pop();
            System.out.print(result);
        }

    }
}
