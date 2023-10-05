package Abstractions_Second_Lection.BirthdayCelebrations;

import Abstractions_Second_Lection.BirthdayCelebrations.Interfaces.Birthable;
import Abstractions_Second_Lection.BirthdayCelebrations.Interfaces.Identifiable;
import Abstractions_Second_Lection.BirthdayCelebrations.Interfaces.Person;

public class Citizen implements Identifiable, Birthable, Person {


    String name;
    int age;
    String id;
    String birthDate;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }
}
