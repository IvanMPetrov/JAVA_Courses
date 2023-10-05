package Polymorphism.Vehicle;

import java.text.DecimalFormat;

public class Truck implements Vehicle {

    final static double AC_ADITIONAL_CONSUMPTION = 1.6;
    final static double REFUEL_LOSS = 0.95;

    private double fuelQuantity;
    private double fuelConsumption;

    public Truck(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        setFuelConsumption(fuelConsumption);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    private void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption + AC_ADITIONAL_CONSUMPTION;
    }


    @Override
    public void refuel(double quantity) {
        fuelQuantity += quantity * REFUEL_LOSS;

    }

    @Override
    public String drive(double kmsToTravel,String typeOfVehicle) {
        DecimalFormat df = new DecimalFormat("##.##");


        double fuelNeeded = fuelConsumption * kmsToTravel;
        if (getFuelQuantity() > fuelNeeded) {
            fuelQuantity -= fuelNeeded;
            return String.format("%s travelled %s km",typeOfVehicle,df.format(kmsToTravel));
        }
        return String.format("%s needs refueling",typeOfVehicle);


    }

    @Override
    public double fuelLeft() {
        return getFuelQuantity();
    }
}
