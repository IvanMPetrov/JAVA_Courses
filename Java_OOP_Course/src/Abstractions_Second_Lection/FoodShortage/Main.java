package Abstractions_Second_Lection.FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,Buyer> buyerMap = new HashMap<>();


        for (int i = 0; i < n; i++) {

            String[] personInfo = scanner.nextLine().split(" ");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);
            String idOrGroup = personInfo[2];

            if (idOrGroup.charAt(0) > 57){

                Rabel rabel = new Rabel(name,age,idOrGroup);
                buyerMap.put(name,rabel);
            }else {

                String birthDate = personInfo[3];
                Citizen citizen = new Citizen(name,age,idOrGroup,birthDate);
                buyerMap.put(name,citizen);
            }

        }

        String input = scanner.nextLine();

        while (!"End".equals(input)){
            if (buyerMap.containsKey(input)){
                buyerMap.get(input).buyFood();
            }
            input = scanner.nextLine();
        }

        System.out.println(buyerMap.values().stream().mapToInt(Buyer::getFood).sum());

    }
}