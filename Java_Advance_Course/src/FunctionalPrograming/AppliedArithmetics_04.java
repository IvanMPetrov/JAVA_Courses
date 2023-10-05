package FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed().collect(Collectors.toList());

        String command = scanner.nextLine();

        Function<List<Integer>, List<Integer>> addFunction = n -> n.stream().map(number -> number + 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> substractFunction = n -> n.stream().map(number -> number - 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiplyFunction = n ->n.stream().map(number -> number * 2).collect(Collectors.toList());

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    listOfNumbers = addFunction.apply(listOfNumbers);
                    break;
                case "subtract":
                    listOfNumbers = substractFunction.apply(listOfNumbers);
                    break;
                case "multiply":
                    listOfNumbers = multiplyFunction.apply(listOfNumbers);
                    break;
                case "print":
                    listOfNumbers.forEach(n -> System.out.print(n + " "));
                    System.out.println();
                    break;
            }


            command = scanner.nextLine();
        }
    }
}
