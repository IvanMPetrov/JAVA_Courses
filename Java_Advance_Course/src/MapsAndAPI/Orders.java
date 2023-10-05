package MapsAndAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Double> mapPrice = new LinkedHashMap<>();
        Map<String, Double> mapQuantity = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")) {

            String productName = input.split(" ")[0];
            double priceProduct = Double.parseDouble(input.split(" ")[1]);
            double quantityProduct = Double.parseDouble(input.split(" ")[2]);

            if (!mapPrice.containsKey(productName) && !mapQuantity.containsKey(productName)) {
                mapPrice.put(productName,priceProduct);
                mapQuantity.put(productName,quantityProduct);

            } else {
                mapPrice.put(productName,priceProduct);
                double currentValue = mapQuantity.get(productName);
                mapQuantity.put(productName,currentValue + quantityProduct);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> element : mapQuantity.entrySet()) {

            String productName = element.getKey();
            double n = element.getValue() * mapPrice.get(productName);

            System.out.printf("%s -> %.2f%n", productName, n);
        }

    }
}