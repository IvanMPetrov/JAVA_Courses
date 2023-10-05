package Polymorphism.WildFarm;

public abstract class Felime extends Mammal{
    public Felime(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
    }
}
