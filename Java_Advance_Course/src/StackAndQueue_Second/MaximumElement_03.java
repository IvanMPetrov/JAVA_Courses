package StackAndQueue_Second;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int count = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < count; i++) {

            int[] command = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


            if (command[0] == 1) {

                stack.push(command[1]);

            } else if (command[0] == 2) {

                stack.pop();
            } else if (command[0] == 3) {
                int biggestNumber = Integer.MIN_VALUE;
                for (int item : stack) {

                    if (item >= biggestNumber) {
                        biggestNumber = item;
                    }
                }
                System.out.println(biggestNumber);
            }

        }

    }
}
