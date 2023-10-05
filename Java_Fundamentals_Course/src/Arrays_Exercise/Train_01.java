package Arrays_Exercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputTimes = Integer.parseInt(scanner.nextLine());
        int[] numbersArray = new int[inputTimes];
        int sum =0;

        for (int i = 0; i < inputTimes ; i++) {
            numbersArray[i] = Integer.parseInt(scanner.nextLine());
            sum = sum + numbersArray[i];
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println();
        System.out.println(sum);




    }
}
