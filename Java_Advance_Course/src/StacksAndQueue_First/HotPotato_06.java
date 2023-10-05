package StacksAndQueue_First;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int num = Integer.parseInt(scanner.nextLine());

        Deque<String> childrenQueue = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            childrenQueue.offer(input[i]);
        }
        while (childrenQueue.size() != 1){
            for (int i = 1; i < num; i++) {
                String currentChild = childrenQueue.poll();
                childrenQueue.offer(currentChild);
            }
            String childToRemove = childrenQueue.poll();
            System.out.println("Removed " + childToRemove);
        }
        String lastChild = childrenQueue.peek();
        System.out.println("Last is " + lastChild);
    }
}
