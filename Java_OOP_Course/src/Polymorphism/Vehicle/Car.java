package Polymorphism.Vehicle;

import java.text.DecimalFormat;

public class Car implements Vehicle{

    final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    private double fuelQuantity;
    private double fuelConsumption;

    public Car(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        setFuelConsumption(fuelConsumption);
    }

    private double getFuelQuantity() {
        return fuelQuantity;
    }





    private void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption  + AC_ADDITIONAL_CONSUMPTION;
    }


    @Override
    public void refuel(double quantity) {
        fuelQuantity += quantity;
    }

    @Override
    public String drive(double kmsToTravel,String typeOfVehicle) {
        DecimalFormat df = new DecimalFormat("##.##");
        double fuelNeeded = fuelConsumption * kmsToTravel;
        if (getFuelQuantity() > fuelNeeded){
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

