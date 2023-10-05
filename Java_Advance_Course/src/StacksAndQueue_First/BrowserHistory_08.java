package StacksAndQueue_First;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> forwardStack = new ArrayDeque<>();
        ArrayDeque<String> backStack = new ArrayDeque<>();


        while (!input.equals("Home")){

            if (input.equals("forward")){

                if (forwardStack.isEmpty()){
                    System.out.println("no next URLs");
                }else {
                    String currentUrl = forwardStack.pop();
                    System.out.println(currentUrl);
                    backStack.push(currentUrl);
                }
            }else if (input.equals("back")){

                if (backStack.isEmpty()){
                    System.out.println("no previous URLs");
                }else {
                    String back = backStack.pop();
                    forwardStack.push(back);
                    if (backStack.isEmpty()){
                        System.out.println("no previous URLs");
                    }else {
                        System.out.println(backStack.peek());
                    }
                }

            }else {
                System.out.println(input);
                backStack.push(input);
                forwardStack.clear();
            }
            input = scanner.nextLine();
        }

    }
}