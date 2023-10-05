package Abstractions_Second_Lection.BirthdayCelebrations;

import Abstractions_Second_Lection.BirthdayCelebrations.Interfaces.Birthable;

public class Pet implements Birthable {
    String name;
    String birthDate;


    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }
}

