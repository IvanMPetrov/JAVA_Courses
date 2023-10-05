package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        for (int item : numbersArray) {
            if (item % 2 == 0) {
                sum += item;
            }else {
                sum = sum - item;
            }

        }
        System.out.println(sum);

    }
}
