package Polymorphism.VehicleExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = getCar(scanner);
        Truck truck = getTruck(scanner);
        Bus bus = getBus(scanner);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            commandExecution(tokens, car, truck, bus);
        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }

    private static Bus getBus(Scanner scanner) {
        String[] busInfo = scanner.nextLine().split("\\s+");
        double busFuelQuantity = Double.parseDouble(busInfo[1]);
        double busLitersPerKm = Double.parseDouble(busInfo[2]);
        double tankCapacity = Double.parseDouble(busInfo[3]);
        return new Bus(busFuelQuantity, busLitersPerKm, tankCapacity);
    }

    private static Truck getTruck(Scanner scanner) {
        String[] truckInfo = scanner.nextLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(truckInfo[1]);
        double truckLitersPerKm = Double.parseDouble(truckInfo[2]);
        double tankCapacity = Double.parseDouble(truckInfo[3]);
        return new Truck(truckFuelQuantity, truckLitersPerKm, tankCapacity);
    }

    private static Car getCar(Scanner scanner) {
        String[] carInfo = scanner.nextLine().split("\\s+");
        double fuelQuantity = Double.parseDouble(carInfo[1]);
        double litersPerKm = Double.parseDouble(carInfo[2]);
        double tankCapacity = Double.parseDouble(carInfo[3]);
        return new Car(fuelQuantity, litersPerKm, tankCapacity);
    }

    public static void commandExecution(String[] tokens, Car car, Truck truck, Bus bus) {
        String command = tokens[0];
        String vehicleType = tokens[1];

        switch (command) {
            case "Drive":
                double distance = Double.parseDouble(tokens[2]);
                if (vehicleType.equals("Car")) {
                    car.drive(distance);
                } else if (vehicleType.equals("Truck")) {
                    truck.drive(distance);
                } else if (vehicleType.equals("Bus")) {
                    bus.setEmpty(false);
                    bus.drive(distance);
                }
                break;
            case "Refuel":
                double liters = Double.parseDouble(tokens[2]);
                if (vehicleType.equals("Car")) {
                    car.refuel(liters);
                } else if (vehicleType.equals("Truck")) {
                    truck.refuel(liters);
                } else if (vehicleType.equals("Bus")) {
                    bus.refuel(liters);
                }
                break;
            case "DriveEmpty":
                double distance1 = Double.parseDouble(tokens[2]);
                bus.setEmpty(true);
                bus.drive(distance1);
                break;
        }

    }
}
