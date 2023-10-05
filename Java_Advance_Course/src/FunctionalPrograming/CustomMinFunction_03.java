package FunctionalPrograming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int [],Integer> function = arr ->{
            int smallestNumber = Integer.MAX_VALUE;
            for (int n:arr) {
                if (smallestNumber >= n){
                    smallestNumber = n;
                }
            }
            return smallestNumber;
        };
        System.out.println(function.apply(numbers));



    }
}
