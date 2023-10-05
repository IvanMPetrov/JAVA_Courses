package Polymorphism.WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;
    protected Mammal(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void eat(Food food) {
        this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
    }
    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]",
                this.getAnimalType(),
                this.getAnimalName(),
                new DecimalFormat("#.##").format(this.getAnimalWeight()),
                this.livingRegion,
                this.getFoodEaten());
    }

}
