package Polymorphism.Vehicle;

public interface Vehicle {


    void refuel(double quantity);


    String drive(double kmsToTravel,String typeOfVehicle);
    double fuelLeft();
}
