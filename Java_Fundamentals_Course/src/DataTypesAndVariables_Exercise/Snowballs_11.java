package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class Snowballs_11 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int cycleCount = Integer.parseInt(scanner.nextLine());
    int calculate = 0;
    double snowballValue = 0;
    double biggestValue = 0;
    int bestSnow = 0;
    int bestTime = 0;
    int bestQuality = 0;

    for (int i = 1; i <= cycleCount; i++) {
        int snow = Integer.parseInt(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());
        int quality = Integer.parseInt(scanner.nextLine());
        calculate = (snow / time);
        snowballValue = Math.pow(calculate, quality);

        if (biggestValue < snowballValue) {
            biggestValue = snowballValue;
            bestSnow = snow;
            bestTime = time;
            bestQuality = quality;

        }


    }
    System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, biggestValue,bestQuality);
}
}
