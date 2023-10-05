package RegularExpressions_Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> list = new ArrayList<>();

        String input = scanner.nextLine();
        double totalPrice = 0;

        while (!input.equals("Purchase")) {

            String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+.[\\d]*)!(?<volume>\\d+)";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String typeFurniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int volume = Integer.parseInt(matcher.group("volume"));

                price = price * volume;
                totalPrice += price;
                list.add(typeFurniture);
            }


            input = scanner.nextLine();
        }
        System.out.println("Bought furniture: ");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.printf("Total money spend: %.2f%n",totalPrice);


    }
}
