package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pokemon_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distance = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int removedItems = 0;

        while (distance.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index <= distance.size() - 1) {
                int item = distance.get(index);
                distance.remove(index);
                removedItems = removedItems + item;
                for (int i = 0; i < distance.size() ; i++) {
                    if (item < distance.get(i)) {
                        int sum = distance.get(i) - item;
                        distance.set(i, sum);
                    } else if (item >= distance.get(i)) {
                        int sum = distance.get(i) + item;
                        distance.set(i, sum);
                    }

                }
            } else if (index < 0) {
                int firstElement = distance.get(0);
                int lastElement = distance.get(distance.size() - 1);
                distance.set(0, lastElement);
                removedItems = removedItems + firstElement;

                for (int element = 0; element < distance.size(); element++) {
                    if (distance.get(element) <= firstElement) {
                        int sum = distance.get(element) + firstElement;
                        distance.set(element, sum);
                    } else if (distance.get(element) > firstElement) {
                        int sum = distance.get(element) - firstElement;
                        distance.set(element, sum);
                    }
                }
            }else if (index > distance.size() - 1) {
                int firstElement = distance.get(0);
                int lastElement = distance.get(distance.size() - 1);
                distance.set(distance.size() - 1, firstElement);
                removedItems = removedItems + lastElement;

                for (int element = 0; element < distance.size() ; element++) {
                    if (distance.get(element) <= lastElement) {
                        int sum = distance.get(element) + lastElement;
                        distance.set(element, sum);
                    } else if (distance.get(element) > lastElement) {
                        int sum = distance.get(element) - lastElement;
                        distance.set(element, sum);
                    }
                }
            }

        }
        System.out.println(removedItems);
    }
}
