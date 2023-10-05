package MapsAndAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Map<String,String> map = new LinkedHashMap<>();


        for (int i = 0; i < num ; i++) {

            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            String name = input.split(" ")[1];

            if (command.equals("register")){
                String number = input.split(" ")[2];
                if (!map.containsKey(name)){
                    map.put(name,number);
                    System.out.printf("%s registered %s successfully%n",name,number);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n",map.get(name));
                }

            }else if (command.equals("unregister")){
                if (map.containsKey(name)){
                    System.out.printf("%s unregistered successfully%n",name);
                    map.remove(name);
                }else {
                    System.out.printf("ERROR: user %s not found%n",name);
                }

            }
        }

        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
