package Java_OOP.SpaceStation.models.bags;

import Java_OOP.SpaceStation.models.bags.interfaces.Bag;

import java.util.Collection;
import java.util.LinkedList;

public class Backpack implements Bag {

    private Collection<String> items;

    public Backpack() {
        this.items = new LinkedList<>();
    }

    @Override
    public Collection<String> getItems() {
        return this.items;
    }
}
