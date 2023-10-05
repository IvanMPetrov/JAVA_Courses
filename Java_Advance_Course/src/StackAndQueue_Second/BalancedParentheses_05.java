package StackAndQueue_Second;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] items = scanner.nextLine().split("");

        int fromStart = items.length / 2;

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < fromStart; i++) {
            stack.push(items[i]);
        }
        for (int i = fromStart; i < items.length ; i++) {
            queue.offer(items[i]);
        }

        String currentStack = null;
        String currentQueue = null;

        if (stack.size() == queue.size()){

            while (!queue.isEmpty()){

                currentStack = stack.peek();
                currentQueue = queue.peek();
                if (currentQueue.equals(")") && currentStack.equals("(")){
                    stack.pop();
                    queue.poll();
                } else if (currentQueue.equals("]") && currentStack.equals("[")){
                    stack.pop();
                    queue.poll();
                }else if (currentQueue.equals("}") && currentStack.equals("{")){
                    stack.pop();
                    queue.poll();
                }else {
                    System.out.println("NO");
                    return;
                }

            }
            System.out.println("YES");
            return;

        }else {
            System.out.println("NO");
        }



    }
}
