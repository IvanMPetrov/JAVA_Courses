package StackAndQueue_Second;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {

            stack.push(input[i]);
        }

        for (String item : stack) {
            System.out.printf("%s ",item);
        }
    }
}