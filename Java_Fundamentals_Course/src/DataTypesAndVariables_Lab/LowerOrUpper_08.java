package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);

        if (symbol >= 'a' && symbol <= 'z'){
            System.out.println("lower-case");
        }else {
            System.out.println("upper-case");
        }

    }
}
