package FunctionalPrograming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CustomComparator_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Integer[] numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toArray(Integer[]::new);

        Comparator<Integer> comparator = (first, second) -> {

            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            } else if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            }
            return first.compareTo(second);
        };

        Arrays.sort(numbersList, comparator);
        Arrays.stream(numbersList).forEach(e -> System.out.print(e + " "));

    }
}
