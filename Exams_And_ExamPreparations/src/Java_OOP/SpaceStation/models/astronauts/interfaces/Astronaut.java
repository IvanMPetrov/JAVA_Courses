package Java_OOP.SpaceStation.models.astronauts.interfaces;


import Java_OOP.SpaceStation.models.bags.interfaces.Bag;

public interface Astronaut {
    String getName();

    double getOxygen();

    boolean canBreath();

    Bag getBag();

    void breath();
}
