package BasicSyntax_Lab;

import java.util.Scanner;

public class BackIn30Min04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int calculated = (hours * 60) + minutes + 30;

        int beThereHour = calculated / 60;
        int beThereMinutes = calculated % 60;

        if (beThereHour == 24){
            beThereHour = 0;
        }

        System.out.printf("%d:%02d",beThereHour,beThereMinutes);
    }
}
