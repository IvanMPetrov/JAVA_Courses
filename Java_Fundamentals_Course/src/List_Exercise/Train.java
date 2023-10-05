package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String firstPart = input.split(" ")[0];

            if (firstPart.equals("Add")) {
                int secondPart = Integer.parseInt(input.split(" ")[1]);

                list.add(secondPart);
            } else {
                if (Integer.parseInt(firstPart) <= capacity) {
                    for (int i = 0; i < list.size(); i++) {
                        int peopleInWagoon = list.get(i);

                        if (peopleInWagoon + Integer.parseInt(firstPart) <= capacity){
                            int currentPeople = list.get(i);
                            list.remove(i);
                            list.add(i,currentPeople + Integer.parseInt(firstPart));
                            break;


                        }
                    }
                }
            }

            input = scanner.nextLine();
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
