package Abstractions_Second_Lection.Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> numbersList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> urlsList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Smartphone smartphone = new Smartphone(numbersList,urlsList);
        System.out.print(smartphone.call());
        System.out.print(smartphone.browse());


    }
}
