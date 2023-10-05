package StacksAndQueue_First;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {

            stack.offer(input[i]);
        }
        int sum = Integer.parseInt(stack.poll());
        int currentNum = 0;
        String symbol = null;

        while (!stack.isEmpty()){

            symbol = stack.poll();

            if (symbol.equals("-")){
                currentNum = Integer.parseInt(stack.poll());
                sum = sum - currentNum;

            }else if (symbol.equals("+")){
                currentNum = Integer.parseInt(stack.poll());
                sum = sum + currentNum;

            }

        }
        System.out.println(sum);

    }
}
