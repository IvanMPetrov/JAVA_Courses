package Abstractions_Second_Lection.DefineAnInterfacePerson;

public class Citizen implements Person{

    private String name;
    private int age;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
