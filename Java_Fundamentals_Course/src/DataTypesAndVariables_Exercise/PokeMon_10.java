package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class PokeMon_10 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int pokePower = Integer.parseInt(scanner.nextLine());
    int distance = Integer.parseInt(scanner.nextLine());
    int exhaust = Integer.parseInt(scanner.nextLine());

    int count = 0;
    int startPower = pokePower;
    double percent = startPower * 0.5;

    while (pokePower >= distance){
        pokePower = pokePower - distance;
        count++;
        if (pokePower == percent){
            if (exhaust > 0){
                pokePower = pokePower / exhaust;
            }
        }
    }
    System.out.println( pokePower);
    System.out.println( count);

}
}
