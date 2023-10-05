package StackAndQueue_Second;

import java.util.Scanner;

public class Fibonacci_06 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int inputNumber = Integer.parseInt(scanner.nextLine());
            if (inputNumber == 0 || inputNumber == 1) {

                System.out.println(1);
            } else {

                long[] fibonacci = new long[inputNumber];
                System.out.println(getFibonacci(inputNumber, fibonacci));

            }
        }

        private static long getFibonacci(int item, long[] fibonacci) {

            if (item == 0 || item == 1) {

                fibonacci[item] = 1;
                return 1;
            }

            if (fibonacci[item - 1] == 0) {

                fibonacci[item - 1] = getFibonacci(item - 1, fibonacci);
            }
            if (fibonacci[item - 2] == 0) {

                fibonacci[item - 2] = getFibonacci(item - 2, fibonacci);
            }
            return fibonacci[item - 1] + fibonacci[item - 2];
        }
    }

