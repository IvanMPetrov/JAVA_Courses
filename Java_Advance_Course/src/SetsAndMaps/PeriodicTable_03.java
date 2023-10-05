package SetsAndMaps;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> elementsSet = new TreeSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String [] currentInput = scanner.nextLine().split(" ");

            for (String item : currentInput) {
                elementsSet.add(item);
            }
        }
        for (String element : elementsSet) {
            System.out.print(element + " ");
        }

    }
}
