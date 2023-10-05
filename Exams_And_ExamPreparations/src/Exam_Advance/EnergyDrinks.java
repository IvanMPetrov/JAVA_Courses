package Exam_Advance;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int maxCaffeine = 0;

        ArrayDeque<Integer> cafeStack = new ArrayDeque<>();


        Arrays.stream(scanner.nextLine().split(",\\s+")).map(String::trim).map(Integer::parseInt).forEach(cafeStack::push);

        ArrayDeque<Integer> energyDrinksQueue = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));


        while (!cafeStack.isEmpty() && !energyDrinksQueue.isEmpty()){
            int currentSum = cafeStack.peek() * energyDrinksQueue.peek();

            if (currentSum <= 300 && maxCaffeine + currentSum < 300){
                maxCaffeine += currentSum;
                cafeStack.pop();
                energyDrinksQueue.poll();
            }else {


                cafeStack.pop();
                int currentDrink = energyDrinksQueue.peek();
                energyDrinksQueue.poll();
                energyDrinksQueue.offer(currentDrink);
                maxCaffeine = maxCaffeine - 30;
                if (maxCaffeine < 0){
                    maxCaffeine = 0;
                }

            }
        }


        if (!energyDrinksQueue.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Integer element : energyDrinksQueue) {
                stringBuilder.append("" + element);
                stringBuilder.append(", ");
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 2);
            System.out.printf("Drinks left: %s%n", stringBuilder);
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.%n", maxCaffeine);


    }
}
