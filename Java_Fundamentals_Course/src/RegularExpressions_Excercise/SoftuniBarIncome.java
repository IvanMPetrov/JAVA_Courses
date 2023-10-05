package RegularExpressions_Excercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftuniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "%(?<namePerson>[A-Z][a-z]*)%[^|$%.]*<(?<productName>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$";


        Pattern pattern = Pattern.compile(regex);
        double totalMoney = 0;

        while (!input.equals("end of shift")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String personName = matcher.group("namePerson");
                String productType = matcher.group("productName");
                String countString = matcher.group("count");
                int count = Integer.parseInt(countString);
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = count * price;
                System.out.printf("%s: %s - %.2f%n", personName, productType, totalPrice);
                totalMoney += totalPrice;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalMoney);


    }
}
