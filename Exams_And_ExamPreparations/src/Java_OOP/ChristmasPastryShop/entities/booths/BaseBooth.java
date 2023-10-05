package Java_OOP.ChristmasPastryShop.entities.booths;

import Java_OOP.ChristmasPastryShop.entities.booths.interfaces.Booth;
import Java_OOP.ChristmasPastryShop.entities.cocktails.interfaces.Cocktail;
import Java_OOP.ChristmasPastryShop.entities.delicacies.interfaces.Delicacy;

import java.util.ArrayList;
import java.util.Collection;

import static Java_OOP.ChristmasPastryShop.common.ExceptionMessages.INVALID_NUMBER_OF_PEOPLE;
import static Java_OOP.ChristmasPastryShop.common.ExceptionMessages.INVALID_TABLE_CAPACITY;


public abstract class BaseBooth implements Booth {



    private final Collection<Delicacy> delicacyOrders = new ArrayList<>();
    private final Collection<Cocktail> cocktailOrders  = new ArrayList<>();
    private int bootNumber;
    private int capacity;
    private int numberOfPeople;
    private double pricePerPerson;
    private boolean isReserved;
    private double price;

    public BaseBooth(int bootNumber, int capacity, double pricePerPerson) {
        this.bootNumber = bootNumber;
        this.pricePerPerson = pricePerPerson;
        setCapacity(capacity);
    }

    @Override
    public int getBoothNumber() {
        return bootNumber;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean isReserved() {
        return isReserved;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void reserve(int numberOfPeople) {
        if(numberOfPeople < 0) {
            throw new IllegalArgumentException(INVALID_NUMBER_OF_PEOPLE);
        }
        this.isReserved = true;
        this.numberOfPeople = numberOfPeople;
        price = numberOfPeople * pricePerPerson;
    }

    @Override
    public double getBill() {
        return price + cocktailOrders.stream().map(Cocktail::getPrice).mapToDouble(d -> d).sum()
                + delicacyOrders.stream().map(Delicacy::getPrice).mapToDouble(d -> d).sum();
    }

    @Override
    public void clear() {
        cocktailOrders.clear();
        delicacyOrders.clear();
        numberOfPeople = 0;
        isReserved = false;
        price = 0;
    }

    public void setCapacity(int capacity) {
        if(capacity < 0) {
            throw new IllegalArgumentException(INVALID_TABLE_CAPACITY);
        }
        this.capacity = capacity;
    }

}
