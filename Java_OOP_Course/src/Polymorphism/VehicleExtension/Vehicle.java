package Polymorphism.VehicleExtension;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
        this.tankCapacity = tankCapacity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    protected abstract void drive(double distance);

    protected abstract void refuel(double liters);

    public abstract String toString();

}
