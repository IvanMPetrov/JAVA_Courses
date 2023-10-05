package Abstractions_Second_Lection.BirthdayCelebrations;

import Abstractions_Second_Lection.BirthdayCelebrations.Interfaces.Birthable;
import Abstractions_Second_Lection.BirthdayCelebrations.Interfaces.Identifiable;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Class[] citizenInterfaces = Citizen.class.getInterfaces();
        if (Arrays.asList(citizenInterfaces).contains(Birthable.class)

                && Arrays.asList(citizenInterfaces).contains(Identifiable.class)) {

            Method[] methods = Birthable.class.getDeclaredMethods();
            Method[] methods1 = Identifiable.class.getDeclaredMethods();

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthDate = scanner.nextLine();

            Identifiable identifiable = new Citizen(name,age,id,birthDate);
            Birthable birthable = new Citizen(name,age,id,birthDate);

            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());

            System.out.println(methods1.length);
            System.out.println(methods1[0].getReturnType().getSimpleName());
        }


        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");


        List<Birthable> birthableList = new ArrayList<>();

        while (!input[0].equals("End")) {
            String typeOfObject = input[0];


            switch (typeOfObject) {

                case "Citizen":
                    String name = input[1];
                    int age = Integer.parseInt(input[2]);
                    String id = input[3];
                    String birthDate = input[4];
                    Citizen citizen = new Citizen(name, age, id, birthDate);
                    birthableList.add(citizen);
                    break;
                case "Pet":
                    name = input[1];
                    birthDate = input[2];
                    Pet pet = new Pet(name, birthDate);
                    birthableList.add(pet);
                    break;
                case "Robot":
                    name = input[1];
                    id = input[2];

                    break;
            }
            input = scanner.nextLine().split(" ");
        }
        String yearToSearch = scanner.nextLine();

        boolean noAction = true;
        for (Birthable element : birthableList) {
            if (element.getBirthDate().endsWith(yearToSearch)) {
                System.out.println(element.getBirthDate());
                noAction = false;
            }
        }
        if (noAction){
            System.out.println("<no output>");
        }


    }
}