package Arrays_Exercise;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int rotation = Integer.parseInt(scanner.nextLine());
        String currentZero ="";

        for (int i = 0; i < rotation; i++) {
            currentZero = array[0];
            for (int j = 0; j < array.length -1 ; j++) {
                array[j]=array[j + 1];
            }
            array[array.length - 1]=currentZero;

        }
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");

        }

    }
}
