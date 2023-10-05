package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] startingArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (startingArray.length > 1) {
            int[] condesedArray = new int[startingArray.length - 1];

            for (int i = 0; i < startingArray.length - 1; i++) {

                condesedArray[i] = startingArray[i] + startingArray[i + 1];
            }

            startingArray = condesedArray;

        }
        System.out.println(startingArray[0]);
    }
}