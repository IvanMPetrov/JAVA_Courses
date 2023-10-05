package Polymorphism.WildFarm;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Animal> animals = new LinkedList<>();

        int counter = 0;

        Animal animal = null;

        while (!input.equals("End")) {

            String[] data = input.split("\\s+");

            if (counter % 2 ==0){
                animal = getAnimalType(data);
                animals.add(animal);
            } else {
                Food food = getFood(data);
                animals.get(animals.size() - 1).makeSound();
                animal.eat(food);
            }

            counter ++ ;
            input = scanner.nextLine();
        }

        animals.forEach(System.out::println);
    }

    private static Food getFood(String[] animalData) {
        String foodType = animalData[0];
        int quantity = Integer.parseInt(animalData[1]);
        Food food = null;
        if (foodType.equals("Vegetable")) {
            food = new Vegetable(quantity);
        } else if(foodType.equals("Meat")){
            food = new Meat(quantity);
        }
        return food;
    }

    private static Animal getAnimalType(String[] animalData) {
        String animalType = animalData[0];
        String animalName = animalData[1];
        Double animalWeight = Double.parseDouble(animalData[2]);
        String animalLivingRegion = animalData[3];
        Animal animal = null;
        switch (animalType) {
            case "Cat":
                String catBreed = animalData[4];
                animal = new Cat(animalType, animalName, animalWeight, animalLivingRegion, catBreed);
                break;
            case "Tiger":
                animal = new Tiger(animalType, animalName, animalWeight, animalLivingRegion);
                break;
            case "Zebra":
                animal = new Zebra(animalType, animalName, animalWeight, animalLivingRegion);
                break;
            case "Mouse":
                animal = new Mouse(animalType, animalName, animalWeight, animalLivingRegion);
                break;
        }
        return animal;
    }

}
