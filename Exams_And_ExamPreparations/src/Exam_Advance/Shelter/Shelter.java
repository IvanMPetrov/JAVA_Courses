package Exam_Advance.Shelter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shelter {

    private int capacity;
    private List<Animal> data;


    public void add(Animal animal) {

        if (data.size() < capacity) {
            data.add(animal);
        }
    }

    public boolean remove(String name) {
        return data.removeIf(animal -> animal.getName().equals(name));
    }

    public Animal getOldestAnimal() {
        return Collections.max(data, (first, second) -> Integer.compare(first.getAge(), second.getAge()));
    }

    public Animal getAnimal(String petName, String ownerName) {
        for (Animal animal : data) {
            if (animal.getName().equals(petName) && animal.getCaretaker().equals(ownerName)) {
                return animal;
            }
        }return null;
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder("The JavaAdvance.shelter has the following animals:");
        for (Animal animal : data) {
            sb.append(System.lineSeparator());
            sb.append(animal.getName() + " " + animal.getCaretaker());
        }
        return sb.toString();
    }

    public int getCount(){
        return data.size();
    }

    public Shelter(int capacity) {
        setCapacity(capacity);
        this.data = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
