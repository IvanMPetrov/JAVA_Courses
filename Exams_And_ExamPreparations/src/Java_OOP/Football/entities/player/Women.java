package Java_OOP.Football.entities.player;

public class Women extends BasePlayer{


    private static final double KG = 60.00;
    private static final int STIMULATION_VALUE = 115;

    public Women(String name, String nationality, int strength) {
        super(name, nationality, KG, strength);



    }

    @Override
    public void stimulation() {
        setStrength(getStrength() + STIMULATION_VALUE);
    }
}
