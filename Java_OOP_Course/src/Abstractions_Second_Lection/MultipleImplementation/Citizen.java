package Abstractions_Second_Lection.MultipleImplementation;

public class Citizen implements Identifiable, Birthable, Person {


    private  String name;
    private  int age;
    private  String id;
    private String birthDate;

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
