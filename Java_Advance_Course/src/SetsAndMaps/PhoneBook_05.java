package SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String[] currentInput = scanner.nextLine().split("-");
        Map<String, String> phonebook = new TreeMap<>();

        while (!currentInput[0].equals("search")) {

                phonebook.put(currentInput[0], currentInput[1]);

                currentInput = scanner.nextLine().split("-");

        }
        String input = scanner.nextLine();

        while (!input.equals("stop")){
            if (phonebook.containsKey(input)){

                System.out.println(input + " -> " + phonebook.get(input));
            }else {

                System.out.println("Contact " + input + " does not exist.");
            }
            input = scanner.nextLine();
        }

    }
}
