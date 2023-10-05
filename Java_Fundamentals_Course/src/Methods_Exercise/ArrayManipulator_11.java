package Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] command = scanner.nextLine().split(" ");

        while (true) {
            switch (command[0]) {
                case "end":
                    System.out.print("[");
                    for (int i = 0; i < intArray.length; i++) {
                        if (i == intArray.length - 1) {
                            System.out.print(intArray[i] + "]");
                            return;
                        }
                        System.out.print(intArray[i] + ", ");
                    }
                case "exchange":
                    int number = Integer.parseInt(command[1]);
                    printExchangeCommand(intArray, number);
                    break;
                case "max":
                    if (command[1].equals("even")) {
                        if (isThereEvenNumber(intArray)) {
                            System.out.println(maxEven(intArray));
                            break;
                        } else {
                            System.out.println("No matches");
                            break;
                        }
                    } else if (command[1].equals("odd")) {
                        if (isThereOddNumber(intArray)) {
                            System.out.println(maxOdd(intArray));
                            break;
                        } else {
                            System.out.println("No matches");
                            break;
                        }
                    }
                    break;
                case "min":
                    if (command[1].equals("even")) {
                        if (isThereEvenNumber(intArray)) {
                            System.out.println(minEven(intArray));
                            break;
                        } else {
                            System.out.println("No matches");
                            break;
                        }
                    } else if (command[1].equals("odd")) {
                        if (isThereOddNumber(intArray)) {
                            System.out.println(minOdd(intArray));
                            break;
                        } else {
                            System.out.println("No matches");
                            break;
                        }
                    }
                    break;
                case "first":
                    if (command[2].equals("even")) {
                        int numbersNeeded = Integer.parseInt(command[1]);
                        if (numbersNeeded > intArray.length) {
                            System.out.println("Invalid count");
                            break;
                        }
                        if (isThereEvenNumber(intArray)) {
                            firstEven(intArray, numbersNeeded);
                            break;
                        } else {
                            System.out.println("[]");
                            break;
                        }
                    } else if (command[2].equals("odd")) {
                        int numbersNeeded = Integer.parseInt(command[1]);
                        if (numbersNeeded > intArray.length) {
                            System.out.println("Invalid count");
                            break;
                        } else if (isThereOddNumber(intArray)) {
                            firstOdd(intArray, numbersNeeded);
                            break;
                        } else {
                            System.out.println("[]");
                            break;
                        }
                    }
                case "last":
                    if (command[2].equals("even")) {
                        int numbersNeed = Integer.parseInt(command[1]);
                        if (isThereEvenNumber(intArray)) {
                            lastEven(intArray, numbersNeed);
                            break;
                        } else {
                            System.out.println("[]");
                            break;
                        }
                    } else if (command[2].equals("odd")) {
                        int numbersNeed = Integer.parseInt(command[1]);
                        if (isThereOddNumber(intArray)) {
                            lastOdd(intArray, numbersNeed);
                            break;
                        }
                    } else {
                        System.out.println("[]");
                        break;
                    }
            }
            command = scanner.nextLine().split(" ");
        }
    }

    private static void printExchangeCommand(int[] intArray, int number) {
        if (intArray.length - 1 < number) {
            System.out.println("Invalid index");
            return;
        }
        int currentItem = 0;
        if (number == 0) {
            number = 1;
        }
        for (int i = 0; i < number; i++) {
            currentItem = intArray[intArray.length - 1];
            for (int j = intArray.length - 1; j > 0; j--) {
                intArray[j] = intArray[j - 1];
            }
            intArray[0] = currentItem;
        }
    }

    private static boolean isThereEvenNumber(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isThereOddNumber(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 1) {
                return true;
            }
        }
        return false;
    }
    private static int maxEven(int[] intArray) {
        int maxEvenPosition = 0;
        int currentNum = 0;
        int highestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            currentNum = intArray[i];
            if (currentNum % 2 == 0) {
                if (highestNumber <= currentNum) {
                    maxEvenPosition = i;
                    highestNumber = currentNum;
                }
            }
        }
        return maxEvenPosition;
    }

    private static int maxOdd(int[] intArray) {
        int maxOddPosition = 0;
        int currentNum = 0;
        int highestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            currentNum = intArray[i];
            if (currentNum % 2 == 1) {
                if (highestNumber <= currentNum) {
                    maxOddPosition = i;
                    highestNumber = currentNum;
                }
            }
        }
        return maxOddPosition;
    }

    private static int minEven(int[] intArray) {
        int minEvenPosition = 0;
        int currentNum = 0;
        int lowestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            currentNum = intArray[i];
            if (currentNum % 2 == 0) {
                if (lowestNumber >= currentNum) {
                    minEvenPosition = i;
                    lowestNumber = currentNum;
                }
            }
        }
        return minEvenPosition;
    }

    private static int minOdd(int[] intArray) {
        int minOddPosition = 0;
        int currentNum = 0;
        int lowestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            currentNum = intArray[i];
            if (currentNum % 2 == 1) {
                if (lowestNumber >= currentNum) {
                    minOddPosition = i;
                    lowestNumber = currentNum;
                }
            }
        }
        return minOddPosition;
    }

    private static void firstEven(int[] intArray, int numbersNeeded) {
        int[] temporaryArray = new int[numbersNeeded + 1];
        int counter = 0;
        int currentNumber = 0;
        if (numbersNeeded > intArray.length) {
            System.out.println("Invalid count");
            return;
        }
        for (int i = 0; i < intArray.length; i++) {
            currentNumber = intArray[i];
            if (currentNumber % 2 == 0) {
                temporaryArray[counter] = currentNumber;
                counter++;
                if (counter == numbersNeeded) {
                    break;
                }
            }
        }
        boolean x = true;
        for (int i = 0; i < temporaryArray.length; i++) {
            if (x) {
                System.out.print("[");
                x = false;
            }
            if (i == temporaryArray.length - 1) {
                System.out.print(temporaryArray[i]);
            }
            if (temporaryArray[i] != 0 && temporaryArray[i + 1] != 0) {
                System.out.print(temporaryArray[i] + ", ");
            } else {
                System.out.print(temporaryArray[i]);
                break;
            }
        }
        System.out.print("]");
        System.out.println();
        return;
    }

    private static void firstOdd(int[] intArray, int numbersNeeded) {
        int[] temporaryArray = new int[numbersNeeded + 1];
        int counter = 0;
        int currentNumber = 0;
        if (numbersNeeded > intArray.length) {
            System.out.println("Invalid count");
            return;
        }
        for (int i = 0; i < intArray.length; i++) {
            currentNumber = intArray[i];
            if (currentNumber % 2 == 1) {
                temporaryArray[counter] = currentNumber;
                counter++;
                if (counter == numbersNeeded) {
                    break;
                }
            }
        }
        boolean x = true;
        for (int i = 0; i < temporaryArray.length; i++) {
            if (x) {
                System.out.print("[");
                x = false;
            }
            if (i == temporaryArray.length - 1) {

                System.out.print(temporaryArray[i]);
            }
            if (temporaryArray[i] != 0 && temporaryArray[i + 1] != 0) {
                System.out.print(temporaryArray[i] + ", ");
            } else {
                System.out.print(temporaryArray[i]);
                break;
            }
        }
        System.out.print("]");
        System.out.println();
        return;
    }

    private static void lastOdd(int[] intArray, int numbersNeeded) {
        int[] temporaryArray = new int[numbersNeeded + 1];
        int counter = 0;
        int currentNumber = 0;
        if (numbersNeeded > intArray.length) {
            System.out.println("Invalid count");
            return;
        }
        for (int i = intArray.length - 1; i >= 0; i--) {
            currentNumber = intArray[i];
            if (currentNumber % 2 == 1) {
                temporaryArray[counter] = currentNumber;
                counter++;
                if (counter == numbersNeeded) {
                    break;
                }
            }
        }
        boolean x = true;
        for (int i = 0; i < temporaryArray.length; i++) {
            if (x) {
                System.out.print("[");
                x = false;
            }
            if (i == temporaryArray.length - 1) {

                System.out.print(temporaryArray[i]);
            }
            if (temporaryArray[i] != 0 && temporaryArray[i + 1] != 0) {
                System.out.print(temporaryArray[i] + ", ");
            } else {
                System.out.print(temporaryArray[i]);
                break;
            }
        }
        System.out.print("]");
        System.out.println();
        return;
    }

    private static void lastEven(int[] intArray, int numbersNeeded) {
        int[] temporaryArray = new int[numbersNeeded + 1];
        int counter = 0;
        int currentNumber = 0;
        if (numbersNeeded > intArray.length - 1) {
            System.out.println("Invalid count");
            return;
        }
        for (int i = intArray.length - 1; i >= 0; i--) {
            currentNumber = intArray[i];
            if (currentNumber % 2 == 0) {
                temporaryArray[counter] = currentNumber;
                counter++;
                if (counter == numbersNeeded) {
                    break;
                }
            }
        }
        boolean x = true;
        for (int i = 0; i < temporaryArray.length; i++) {
            if (x) {
                System.out.print("[");
                x = false;
            }
            if (i == temporaryArray.length - 1) {

                System.out.print(temporaryArray[i]);
            }
            if (temporaryArray[i] != 0 && temporaryArray[i + 1] != 0) {
                System.out.print(temporaryArray[i] + ", ");
            } else {
                System.out.print(temporaryArray[i]);
                break;
            }
        }
        System.out.print("]");
        System.out.println();
        return;
    }
}

