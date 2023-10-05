package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] arrayNum = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputParts = input.split(" ");
            String inputType = inputParts[0];
            switch (inputType) {
                case "swap":
                    int firstNum = Integer.parseInt(inputParts[1]);
                    int secondNum = Integer.parseInt(inputParts[2]);

                    int swap1 = arrayNum[firstNum];
                    int swap2 = arrayNum[secondNum];

                    arrayNum[firstNum] = swap2;
                    arrayNum[secondNum] = swap1;
                    break;
                case "multiply":
                    int firstMultiply = Integer.parseInt(inputParts[1]);
                    int secondMultiply = Integer.parseInt(inputParts[2]);

                    firstNum = arrayNum[firstMultiply];
                    secondNum = arrayNum[secondMultiply];
                    int sum = firstNum * secondNum;
                    arrayNum[firstMultiply] = sum;
                    break;
                case "decrease":
                    for (int i = 0; i < arrayNum.length ; i++) {

                        arrayNum[i]=arrayNum[i] - 1;

                    }
                    break;

            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < arrayNum.length; i++) {

            if (i != arrayNum.length - 1) {
                System.out.print(arrayNum[i] + ", ");
            } else {
                System.out.print(arrayNum[i]);
            }
        }


    }
}