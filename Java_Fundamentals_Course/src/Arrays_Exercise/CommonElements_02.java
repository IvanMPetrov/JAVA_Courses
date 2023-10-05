package Arrays_Exercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        String[] firstArray = firstInput.split(" ");
        String[] secondArray = secondInput.split(" ");

        for (String secondItem:secondArray) {
            for (String firstItem:firstArray) {
            if (secondItem.equals(firstItem)){
                System.out.print(firstItem + " ");
            }
            }
        }



    }
}
