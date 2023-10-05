package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

            String input = scanner.nextLine();

        while (!input.equals("End")){
            String command = input.split(" ")[0];

            if (command.equals("Add")){
                String number = input.split(" ")[1];
                numbersList.add(number);


            }else if (command.equals("Remove")){
                int number =Integer.parseInt(input.split(" ")[1]);

                if (number > numbersList.size() - 1){
                    System.out.println("Invalid index");
                }else {
                    numbersList.remove(number);
                }

            }else if (command.equals("Shift")){
                String command2 = input.split(" ")[1];
                int times = Integer.parseInt(input.split(" ")[2]);

                if (command2.equals("left")){
                    for (int i = 0; i < times; i++) {
                        String num = numbersList.get(0);

                        numbersList.remove(0);
                        numbersList.add(num);
                    }//5 12 42 95 32 8 1 3
                }else if (command2.equals("right")){
                    for (int i = 0; i < times; i++) {
                        String num = numbersList.get(numbersList.size() - 1);

                        numbersList.remove(numbersList.size() - 1);
                        numbersList.add(0,num);
                    }
                }
            } else if (command.equals("Insert")){
                String number = input.split(" ")[1];
                int position =Integer.parseInt(input.split(" ")[2]);

                numbersList.add(position,number);
            }

            input= scanner.nextLine();
        }
        for (String num : numbersList) {
            System.out.print(num + " ");
        }

    }
}
