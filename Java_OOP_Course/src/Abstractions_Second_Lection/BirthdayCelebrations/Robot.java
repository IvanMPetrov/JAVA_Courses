package Abstractions_Second_Lection.BirthdayCelebrations;

import Abstractions_Second_Lection.BirthdayCelebrations.Interfaces.Identifiable;

public class Robot implements Identifiable {

    String id;
    String model;

    @Override
    public String getId() {
        return this.id;
    }

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

}
