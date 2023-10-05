package MapsAndAPI;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("shards", 0);
        map.put("fragments", 0);
        map.put("motes", 0);

        Map<String, Integer> junkMap = new LinkedHashMap<>();
        boolean flag = true;

        while (flag) {
            String command = scanner.nextLine();
            String[] itemsArray = command.split(" ");

            for (int i = 0; i < itemsArray.length; i += 2) {

                int quantity = Integer.parseInt(itemsArray[i]);
                String material = itemsArray[i + 1].toLowerCase(Locale.ROOT);

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentValue = map.get(material);
                    map.put(material, currentValue + quantity);

                } else if (!junkMap.containsKey(material)) {

                    junkMap.putIfAbsent(material, quantity);
                } else {
                    int currentValue = junkMap.get(material);
                    map.put(material, quantity + currentValue);
                }

                if (map.get("shards") >= 250) {
                    int currentValue = map.get("shards");
                    map.put("shards", currentValue - 250);
                    System.out.println("Shadowmourne obtained!");
                    flag = false;
                    break;
                } else if (map.get("fragments") >= 250) {
                    int currentValue = map.get("fragments");
                    map.put("fragments", currentValue - 250);
                    System.out.println("Valanyr obtained!");
                    flag = false;
                    break;
                } else if (map.get("motes") >= 250) {
                    int currentValue = map.get("motes");
                    map.put("motes", currentValue - 250);
                    System.out.println("Dragonwrath obtained!");
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        map.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
        junkMap.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));


    }
}