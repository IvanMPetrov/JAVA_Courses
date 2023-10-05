package FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        List<String> nameList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Predicate<String> predicate = s -> s.length() <= number;

        nameList.stream().filter(predicate).forEach(System.out::println);
    }
}
