package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersList = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split("\\s+");
        String numberToDetonate = input[0];
        int power = Integer.parseInt(input[1]);
        int sum = 0;

        while (numbersList.contains(numberToDetonate)){

            int position = numbersList.indexOf(numberToDetonate);

            int starting = Math.max(0, position - power);
            int end = Math.min( position + power, numbersList.size() - 1);

            for (int i = end; i >= starting; i--) {
                numbersList.remove(i);

            }
        }
        System.out.println(numbersList.stream().mapToInt(Integer::parseInt).sum());


    }
}


