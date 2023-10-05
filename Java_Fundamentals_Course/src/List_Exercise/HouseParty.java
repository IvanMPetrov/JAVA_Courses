package List_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> namesList = new ArrayList<>();

        int times = Integer.parseInt(scanner.nextLine());
        namesList.add(0,"asd");
        boolean asd = true;


        for (int i = 0; i < times; i++) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            String command = input.split(" ")[2];

            boolean isTherePerson = isTherePerson(namesList, name);

            if (command.equals("not")) {
                if (isTherePerson) {
                    namesList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!",name);
                }

            } else {
                if (isTherePerson){
                    System.out.printf("%s is already in the list!",name);
                }else {
                    namesList.add(name);
                }

            }
            if (asd){
                namesList.remove("asd");
                asd = false;
            }

        }
        System.out.println();
        for (String name : namesList) {
            System.out.println(name);
        }


    }

    public static boolean isTherePerson(List<String> nameList, String currentName) {
        for (String name : nameList) {
            if (name.equals(currentName)) {
                return true;
            }
        }
        return false;

    }
}
