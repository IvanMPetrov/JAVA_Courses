package Polymorphism.VehicleExtension;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    private static final double AIR_CONDITIONER_CONSUMPTION = 0.9;

    protected Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected void drive(double distance) {
        double neededFuelToDrive = distance * (this.getFuelConsumption() + AIR_CONDITIONER_CONSUMPTION);
        if (this.getFuelQuantity() >= neededFuelToDrive) {
            this.setFuelQuantity(this.getFuelQuantity() - neededFuelToDrive);
            DecimalFormat dc = new DecimalFormat("#.##");
            System.out.printf("Car travelled %s km%n", dc.format(distance));
        } else {
            System.out.println("Car needs refueling");
        }
    }

    @Override
    protected void refuel(double liters) {
        if (liters <= 0) {
            System.out.println(("Fuel must be a positive number"));
        } else {
            double totalFuel = this.getFuelQuantity() + liters;
            if (this.getTankCapacity() < totalFuel) {
                System.out.println("Cannot fit fuel in tank");
            } else {
                this.setFuelQuantity(this.getFuelQuantity() + liters);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f", this.getFuelQuantity());
    }

}
