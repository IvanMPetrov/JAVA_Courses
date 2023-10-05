package ObjectsAndClasses.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();

        String command = scanner.nextLine();
        double carsHorsepower = 0.00;
        double trucksHorsepower = 0.00;
        int carsCounter = 0;
        int trucksCounter = 0;
        while (!command.equals("End")) {
            String typeCar = command.split(" ")[0];
            String modelCar = command.split(" ")[1];
            String color = command.split(" ")[2];
            String horsepower = command.split(" ")[3];

            if (typeCar.equals("car")) {
                carsHorsepower = carsHorsepower + Double.parseDouble(horsepower);
                carsCounter++;
                typeCar = "Car";
            } else if (typeCar.equals("truck")) {
                trucksHorsepower = trucksHorsepower + Double.parseDouble(horsepower);
                trucksCounter++;
                typeCar = "Truck";
            }
            Vehicle vehicle = new Vehicle(typeCar, modelCar, color, horsepower);
            vehicleList.add(vehicle);
            command = scanner.nextLine();
        }
        command = scanner.nextLine();

        while (!command.equals("Close the Catalogue")) {

            for (Vehicle vehicle : vehicleList) {
                if (command.equals(vehicle.getModelCar())) {
                    System.out.println(vehicle);
                    command = scanner.nextLine();
                }
            }

        }
        if (carsHorsepower > 0) {
            double totalCarsHP = carsHorsepower / carsCounter;
            System.out.printf("Cars have average horsepower of: %.2f.", totalCarsHP);
        } else {
            System.out.printf("Cars have average horsepower of: 0.00.");
        }
        System.out.println();
        if (trucksHorsepower > 0) {
            double totalTrucksHP = trucksHorsepower / trucksCounter;
            System.out.printf("Trucks have average horsepower of: %.2f.", totalTrucksHP);
        } else {
            System.out.printf("Trucks have average horsepower of: 0.00.");
        }


    }
}
