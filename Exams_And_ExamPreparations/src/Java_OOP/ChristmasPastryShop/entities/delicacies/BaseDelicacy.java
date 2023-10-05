package Java_OOP.ChristmasPastryShop.entities.delicacies;

import Java_OOP.ChristmasPastryShop.entities.delicacies.interfaces.Delicacy;

public abstract class BaseDelicacy implements Delicacy {
    private String name;
    private double portion;
    private double price;

    public BaseDelicacy(String name, double portion, double price) {
        setName(name);
        setPortion(portion);
        setPrice(price);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null  || name.contains(" ")) {
            throw new IllegalArgumentException("Name cannot be null or white space!");
        }
        this.name = name;
    }



    public void setPortion(double portion) {
        if(portion <= 0) {
            throw new IllegalArgumentException("Portion cannot be less or equal to zero!");
        }
        this.portion = portion;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0) {
            throw new IllegalArgumentException("Price cannot be less or equal to zero!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": "+ String.format("%.2f",portion)+ "g - " + String.format("%.2f",price);
    }
}
