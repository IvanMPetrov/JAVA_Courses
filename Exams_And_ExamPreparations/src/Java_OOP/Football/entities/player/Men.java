package Java_OOP.Football.entities.player;

public class Men extends BasePlayer{

    private static final double KG = 85.50;
    private static final int STIMULATION_VALUE = 145;

    public Men(String name, String nationality, int strength) {
        super(name, nationality, KG, strength);
    }


    @Override
    public void stimulation() {
    setStrength(getStrength() + STIMULATION_VALUE);
    }
}
