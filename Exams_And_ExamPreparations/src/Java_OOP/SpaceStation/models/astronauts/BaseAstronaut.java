package Java_OOP.SpaceStation.models.astronauts;

import Java_OOP.SpaceStation.models.astronauts.interfaces.Astronaut;
import Java_OOP.SpaceStation.models.bags.Backpack;
import Java_OOP.SpaceStation.models.bags.interfaces.Bag;

import static Java_OOP.SpaceStation.common.ExceptionMessages.ASTRONAUT_NAME_NULL_OR_EMPTY;
import static Java_OOP.SpaceStation.common.ExceptionMessages.ASTRONAUT_OXYGEN_LESS_THAN_ZERO;


public abstract class BaseAstronaut implements Astronaut {

    private static final double OXYGEN_DECREASE_VALUE = 10;

    private String name;
    private double oxygen;
    private Bag bag;

    protected BaseAstronaut(String name, double oxygen) {
        setName(name);
        setOxygen(oxygen);
        bag = new Backpack();
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ASTRONAUT_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setOxygen(double oxygen) {
        if (oxygen < 0) {
            throw new IllegalArgumentException(ASTRONAUT_OXYGEN_LESS_THAN_ZERO);
        }
        this.oxygen = oxygen;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getOxygen() {
        return this.oxygen;
    }

    @Override
    public boolean canBreath() {
        return false;
    }

    @Override
    public Bag getBag() {
        return this.bag;
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
