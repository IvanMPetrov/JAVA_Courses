package CarManufacture;

public class Engine {

    private String engineModel;
    private String power;
    private int displacement = 0;
    private String efficiency = "n/a";




    public Engine(String power) {
        this.power = power;
    }

    public Engine(String engineModel, String power, String efficiency) {
        this.engineModel = engineModel;
        this.power = power;
        this.efficiency = efficiency;
    }

    public Engine(String engineModel, String power) {
        this(power);
        this.engineModel = engineModel;

    }

    public Engine(String engineModel, String power, int displacement) {
        this(engineModel, power);
        this.displacement = displacement;
    }

    public Engine(String engineModel, String power, int displacement, String efficiency) {
        this(engineModel, power,displacement);
        this.efficiency = efficiency;


    }



    public String getEngineModel() {
        return engineModel;
    }


    public String getPower() {
        return power;
    }


    public String getDisplacement() {
        if (displacement == 0){
            return "n/a";
        }
        return String.valueOf(displacement);
    }


    public String getEfficiency() {
        return efficiency;
    }


}
