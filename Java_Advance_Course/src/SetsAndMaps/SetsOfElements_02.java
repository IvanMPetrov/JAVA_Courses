package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> firstSet = new LinkedHashSet<>();
        Set<String> secondSet = new LinkedHashSet<>();

        String[] input =scanner.nextLine().split(" ");
        int firstInput =Integer.parseInt(input[0]);
        int secondInput =Integer.parseInt(input[1]);

        for (int i = 0; i < firstInput; i++) {
            firstSet.add(scanner.nextLine());

        }
        for (int i = 0; i < secondInput; i++) {
            secondSet.add(scanner.nextLine());
        }

       firstSet.retainAll(secondSet);

        for (String el : firstSet) {
            System.out.print(el + " ");
        }
    }
}
