package ТextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num1 = new BigInteger(scanner.nextLine());
        BigInteger num2 = new BigInteger(scanner.nextLine());


        num1 = num1.multiply(num2);
        System.out.println(num1);




    }
}
