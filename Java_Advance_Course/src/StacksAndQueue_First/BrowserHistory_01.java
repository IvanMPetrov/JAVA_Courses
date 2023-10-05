package StacksAndQueue_First;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();
        String currentUrl = null;

        while (!input.equals("Home")){


            if (input.equals("back")){
                //пускам последния урл
                //ако няма в стека инфо принтирам няма повече урл
                if (stack.isEmpty()){
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }else {
                    currentUrl = stack.pop();
                }


            }else {
                //добавям в стека новия урл
                if (currentUrl != null) {
                    stack.push(currentUrl);
                }
                currentUrl = input;
            }

            System.out.println(currentUrl);
            input = scanner.nextLine();
        }

    }
}
