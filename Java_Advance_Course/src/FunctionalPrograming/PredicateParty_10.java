package FunctionalPrograming;

import java.util.*;
import java.util.stream.Collectors;

public class PredicateParty_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> nameList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        Set<String> commands = new HashSet<>();

        while (!command.equals("Party!")){
            commands.add(command);
        }


    }
}
