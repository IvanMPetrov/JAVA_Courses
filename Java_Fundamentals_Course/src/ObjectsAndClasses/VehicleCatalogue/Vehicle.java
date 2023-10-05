package ObjectsAndClasses.VehicleCatalogue;

public class Vehicle {

    private String typeCar;
    private String modelCar;
    private String color;
    private String horsepower;

    public Vehicle(String typeCar,String modelCar,String color,String horsepower){
        this.typeCar = typeCar;
        this.modelCar = modelCar;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModelCar() {
        return modelCar;
    }



    @Override
    public String toString(){

        return String.format("Type: %s%n" + "Model: %s%n" + "Color: %s%n" + "Horsepower: %s",typeCar,modelCar,color,horsepower);

    }


}
