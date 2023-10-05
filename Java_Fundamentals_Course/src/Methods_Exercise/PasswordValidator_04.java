package Methods_Exercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPassword = scanner.nextLine();

        if (!printStringLength(inputPassword)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!printOnlyDigitsAndLetters(inputPassword)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!printDigitsCheck(inputPassword)){
            System.out.println("Password must have at least 2 digits");
        }
        if (printDigitsCheck(inputPassword) &&
        printStringLength(inputPassword) &&
        printOnlyDigitsAndLetters(inputPassword)){
            System.out.println("Password is valid");
        }
    }

    private static boolean printStringLength(String inputPassword) {
        int length = inputPassword.length();
        if (length >= 6 && length <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean printOnlyDigitsAndLetters(String inputPassword) {
        for (char item:inputPassword.toCharArray()) {
            if (!Character.isLetterOrDigit(item)){
                return false;
            }
        }
        return true;
    }
    private static boolean printDigitsCheck(String inputPassword) {

        int counter = 0;
        for (char item : inputPassword.toCharArray()) {
            if (Character.isDigit(item)) {
                counter++;
            }
        }
        if (counter >= 2){
            return true;
        }else {
            return false;
        }
    }

}

