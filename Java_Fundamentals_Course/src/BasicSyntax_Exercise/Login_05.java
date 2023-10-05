package BasicSyntax_Exercise;

import java.util.Scanner;

public class Login_05 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String username = scanner.nextLine();
    String password = "";
    int counter =0;


    for (int position = username.length() - 1; position >= 0; position--) {
        char symbol = username.charAt(position);
        password = password + symbol;
    }
    String passwordInput = scanner.nextLine();

    while (true){
        if (password.equals(passwordInput)){
            System.out.printf("User %s logged in.",username);
            return;
        }
        if (counter > 2){
            System.out.printf("User %s blocked!",username);
            return;
        }
        if (!passwordInput.equals(password)){
            System.out.println("Incorrect password. Try again.");
            counter++;


            passwordInput= scanner.nextLine();
        }
    }


}
}
