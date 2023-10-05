package Arrays_Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = (scanner.nextLine().split(" "));

        String currentSymbol = " ";

        for (int i = 0; i < array.length / 2; i++) {
            currentSymbol = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = currentSymbol;

        }
        System.out.print(String.join(" ",array));


    }
}
