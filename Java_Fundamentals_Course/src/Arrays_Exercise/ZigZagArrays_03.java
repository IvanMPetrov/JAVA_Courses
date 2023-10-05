package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[firstInput];
        int[] secondArray = new int[firstInput];

        for (int revolutes = 0; revolutes < firstInput; revolutes++) {
            int[] tempNums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (revolutes % 2 == 0){
                firstArray[revolutes]=tempNums[0];
                secondArray[revolutes]=tempNums[1];
            }else {
                firstArray[revolutes]=tempNums[1];
                secondArray[revolutes]=tempNums[0];
            }

        }
        for (int i = 0; i < firstInput; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < firstInput; i++) {
            System.out.print(secondArray[i] + " ");
        }

    }
}
