package FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        Function<List<Integer>, Integer> function = list -> {
            int smallestNum = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < list.size(); i++) {

                if (list.get(i) <= smallestNum){
                    smallestNum = list.get(i);
                    index = i;
                }
            }
            return index;
        };

        System.out.println(function.apply(numList));
    }
}
