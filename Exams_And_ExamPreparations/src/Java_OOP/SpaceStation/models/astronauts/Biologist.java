package Java_OOP.SpaceStation.models.astronauts;

public class Biologist extends BaseAstronaut{

    private static final double INITIAL_UNITS_OF_OXYGEN = 70;
    private static final double OXYGEN_DECREASE_VALUE = 5;
    public Biologist(String name) {
        super(name, INITIAL_UNITS_OF_OXYGEN);
    }



    @Override
    public void breath() {
        double currentOxygen = getOxygen() - OXYGEN_DECREASE_VALUE;
        if (currentOxygen < 0 ){
            setOxygen(0);
        }else {
            setOxygen(currentOxygen);
        }
    }
}
