package StackAndQueue_Second;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstInput = scanner.nextLine().split(" ");
        int[] secondInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = Integer.parseInt(firstInput[0]);
        int toBePoped = Integer.parseInt(firstInput[1]);
        int doesExist = Integer.parseInt(firstInput[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();



        for (int i = 0; i < count; i++) {
        stack.push(secondInput[i]);
        }

        for (int i = 0; i < toBePoped; i++) {
            stack.pop();
        }

        if (stack.isEmpty()){
            System.out.println(0);
            return;
        }

        for (Integer item : stack) {
            if (item ==  doesExist){
                System.out.println("true");
                return;
            }
        }
        int lowestNumber = Integer.MAX_VALUE;

        for (Integer item : stack) {
            if (item <= lowestNumber){
                lowestNumber = item;
            }
        }
        System.out.println(lowestNumber);


    }
}
