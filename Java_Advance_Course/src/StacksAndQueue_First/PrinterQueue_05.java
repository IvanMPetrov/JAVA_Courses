package StacksAndQueue_First;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("print")){

            if (input.equals("cancel") && !queue.isEmpty()){
                String current = queue.poll();
                System.out.println("Canceled " + current);
            } else if (queue.isEmpty() && input.equals("cancel")){
                System.out.println("Printer is on standby");
            } else {
                queue.offer(input);
            }
            input = scanner.nextLine();
        }

        for (String item : queue) {
            System.out.println(item);
        }

    }
}
