package Polymorphism.VehicleExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicle {
    private boolean isEmpty;

    protected Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.setEmpty(false);
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    protected void drive(double distance) {
        double neededFuelToDrive = 0;
        if (isEmpty) {
            neededFuelToDrive = distance * this.getFuelConsumption();
        } else {
            neededFuelToDrive = distance * (this.getFuelConsumption() + 1.4);
        }

        if (this.getFuelQuantity() >= neededFuelToDrive) {
            this.setFuelQuantity(this.getFuelQuantity() - neededFuelToDrive);
            DecimalFormat dc = new DecimalFormat("#.##");
            System.out.printf("Bus travelled %s km%n", dc.format(distance));
        } else {
            System.out.println("Bus needs refueling");
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
        return String.format("Bus: %.2f", this.getFuelQuantity());
    }
}