package Java_OOP.ChristmasPastryShop.entities.cocktails;

import Java_OOP.ChristmasPastryShop.entities.cocktails.interfaces.Cocktail;

import static Java_OOP.ChristmasPastryShop.common.ExceptionMessages.*;


public abstract class BaseCocktail implements Cocktail {

    private String name;
    private String brand;
    private int size;
    private double price;

    public BaseCocktail(String name, int size, double price, String brand) {
        setName(name);
        setBrand(brand);
        setSize(size);
        setPrice(price);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null  || name.contains(" ")) {
            throw new IllegalArgumentException(INVALID_NAME);
        }
        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size <= 0) {
            throw new IllegalArgumentException(INVALID_SIZE);
        }
        this.size = size;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0) {
            throw new IllegalArgumentException(INVALID_PRICE);
        }
        this.price = price;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null  || brand.contains(" ")) {
            throw new IllegalArgumentException(INVALID_BRAND);
        }
        this.brand = brand;
    }

    @Override
    public String toString() {
        return name + " " + brand + " - "+ String.format("%.2f", size)+ "ml - " + String.format("%.2f",price)+"lv";
    }
}
