package Abstractions_Second_Lection.FoodShortage;

public class Rabel implements Buyer,Person{

    String name;
    int age;
    String group;
    int food = 0;

    public Rabel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }


    @Override
    public void buyFood() {

        this.food += 5;
    }

    @Override
    public int getFood() {
        return food;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
