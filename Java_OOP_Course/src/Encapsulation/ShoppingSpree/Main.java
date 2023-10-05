package Encapsulation.ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[]nameAndMoney = scanner.nextLine().split(";");
        String[]productsAndCost = scanner.nextLine().split(";");

        Map<String,Person> personMap = new LinkedHashMap<>();
        Map<String,Product> productMap = new HashMap<>();

        for (String eachPerson : nameAndMoney) {
            String[] personParts = eachPerson.split("=");
            String name = personParts[0];
            double money = Double.parseDouble(personParts[1]);

            try {
                Person person = new Person(name,money,new ArrayList<>());
                personMap.put(name,person);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                return;
            }
        }
        for (String element : productsAndCost) {
            String [] elementParts = element.split("=");
            String name = elementParts[0];
            double cost = Double.parseDouble(elementParts[1]);

            try {
                Product product = new Product(name,cost);
                productMap.put(name,product);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                return;
            }
        }

        String command = scanner.nextLine();
        while (!"END".equals(command)){

            String[] commandParts = command.split(" ");
            String personName = commandParts[0];
            String productName = commandParts[1];

            try {
                Person person = personMap.get(personName);
                Product product = productMap.get(productName);
                person.buyProduct(product);
                System.out.printf("%s bought %s%n",personName,productName);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
            command = scanner.nextLine();
        }

        personMap.values().forEach(System.out::println);

    }
}
