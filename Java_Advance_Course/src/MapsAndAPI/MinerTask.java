package MapsAndAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!map.containsKey(input)) {
                map.put(input, quantity);
            } else {
                int currentQuantity = map.get(input);
                map.put(input, currentQuantity + quantity);
            }
            input = scanner.nextLine();
        }
        map.entrySet().forEach(entry -> System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue()));


    }
}
