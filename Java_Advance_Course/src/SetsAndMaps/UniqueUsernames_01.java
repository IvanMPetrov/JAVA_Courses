package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Set<String> names = new LinkedHashSet<>();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String currentName = scanner.nextLine();
            names.add(currentName);

        }
        for (String name : names) {
            System.out.println(name);
        }

    }
}
