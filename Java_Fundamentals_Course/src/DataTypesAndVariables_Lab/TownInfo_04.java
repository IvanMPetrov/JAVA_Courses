package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class TownInfo_04 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    String city = scanner.nextLine();
    int population = Integer.parseInt(scanner.nextLine());
    int land = Integer.parseInt(scanner.nextLine());

    System.out.printf("Town %s has population of %d and area %d square km.",city , population , land);

}
}
