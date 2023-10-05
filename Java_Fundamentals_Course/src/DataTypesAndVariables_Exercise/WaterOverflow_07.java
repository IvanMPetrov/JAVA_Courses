package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class WaterOverflow_07 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int waterTank = 255;
    int timesPouring = Integer.parseInt(scanner.nextLine());
    int sum=0;

    for (int i = 0; i < timesPouring; i++) {
        int liters = Integer.parseInt(scanner.nextLine());
        sum += liters;
        if (sum > waterTank){
            System.out.println("Insufficient capacity!");
            sum = sum - liters;
        }

    }
    System.out.println(sum);

}
}
