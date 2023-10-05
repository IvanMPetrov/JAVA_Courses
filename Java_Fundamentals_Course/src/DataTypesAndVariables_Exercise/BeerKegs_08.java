package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class BeerKegs_08 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double i = 2;
    int inputTimes = Integer.parseInt(scanner.nextLine());
    double biggestKeg = 0;
    String biggestModel = "";

    for (int j = 1; j <= inputTimes; j++) {
        String model = scanner.nextLine();
        double radius = Double.parseDouble(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        double sum = Math.PI * Math.pow(radius,i) * height;
        if (biggestKeg < sum){
            biggestModel = model;
            biggestKeg = sum;
        }

    }
    System.out.println(biggestModel);

}
}
