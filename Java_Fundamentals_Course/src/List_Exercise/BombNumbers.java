package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        String numberToDetonate = input.split("\\s+")[0];
        int power = Integer.parseInt(input.split("\\s+")[1]);
        int position = numbersList.indexOf(numberToDetonate);
        boolean isTrue = false;


        while (!isTrue) {
            for (int i = 1; i <= power; i++) {
                if (position - 1 < 0){

                }else {
                    numbersList.remove(position - 1);
                    position--;
                }
                if (position + 1 > numbersList.size() - 1){

                }else {
                    numbersList.remove(position + 1);
                }

            }
            numbersList.remove(position);

            for (String numbers : numbersList) {

                if (!numbers.equals(numberToDetonate)) {
                    isTrue = true;
                } else {
                    isTrue = false;
                    position = numbersList.indexOf(numberToDetonate);
                    break;
                }
            }
        }
        int totalSum = 0;
        for (String num : numbersList) {
            int number = Integer.parseInt(num);
            totalSum += number;
        }
        System.out.println(totalSum);


    }
}
