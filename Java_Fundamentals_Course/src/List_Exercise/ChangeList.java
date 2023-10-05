package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String command = input.split(" ")[0];

            if (command.equals("Delete")) {
                for (int i = 0; i < list.size(); i++) {
                    int currentElement = list.get(i);
                    int numToDelete = Integer.parseInt(input.split(" ")[1]);
                    if (currentElement == numToDelete) {
                        list.remove(i);
                    }
                }
            } else if (command.equals("Insert")) {
                int position = Integer.parseInt(input.split(" ")[2]);
                int numToAdd = Integer.parseInt(input.split(" ")[1]);
                list.add(position, numToAdd);

            }
            input = scanner.nextLine();
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
