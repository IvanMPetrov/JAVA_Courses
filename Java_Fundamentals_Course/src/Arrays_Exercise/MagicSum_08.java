package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int compare = Integer.parseInt(scanner.nextLine());
        int currentNum =0;

        for (int i = 0; i < numArr.length ; i++) {
            currentNum = numArr[i];

            for (int j = i + 1; j < numArr.length; j++) {
                if (currentNum + numArr[j] == compare){
                    System.out.printf("%d %d%n",currentNum,numArr[j]);

                }
            }






        }

    }
}
