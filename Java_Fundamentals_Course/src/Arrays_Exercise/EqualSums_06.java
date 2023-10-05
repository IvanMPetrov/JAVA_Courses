package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean flag = true;

        for (int item = 0; item < numArray.length; item++) {
            int currentElement = item;
            int leftSum = 0;
            int rightSum = 0;


            for (int leftNum = 0; leftNum < currentElement; leftNum++) {
            leftSum += numArray[leftNum];

            }
            for (int rightNum = currentElement + 1; rightNum < numArray.length ; rightNum++) {
                rightSum += numArray[rightNum];

            }
            if (rightSum == leftSum){
                System.out.println(currentElement);
                flag = false;
            }

        }
        if (flag){
            System.out.println("no");
        }
    }
}
