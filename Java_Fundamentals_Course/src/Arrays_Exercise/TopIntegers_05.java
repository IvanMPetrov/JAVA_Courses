package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < array.length ; i++) {
            int currentNumber = array[i];

            if(i == array.length - 1) {
                System.out.print(currentNumber + " ");
                break;
            }

            boolean isTop = false;
            for (int j = i + 1; j < array.length ; j++) {

                int nextNumber = array[j];
                if (currentNumber > nextNumber) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(currentNumber + " ");
            }
        }
    }


}

