package FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = Integer.parseInt(scanner.nextLine());

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Predicate<Integer> predicate = number -> {

            for (Integer element:numbersList) {

                if (number % element != 0){
                    return false;
                }
            }
            return true;
        };

        for (int number = 1; number <= range ; number++) {

            if (predicate.test(number)){
                System.out.print(number + " ");
            }
        }


    }
}
