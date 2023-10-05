package Java_OOP.ChristmasPastryShop.core;

import Java_OOP.ChristmasPastryShop.common.enums.BoothType;
import Java_OOP.ChristmasPastryShop.common.enums.CocktailType;
import Java_OOP.ChristmasPastryShop.common.enums.DelicacyType;
import Java_OOP.ChristmasPastryShop.core.interfaces.Controller;
import Java_OOP.ChristmasPastryShop.entities.booths.OpenBooth;
import Java_OOP.ChristmasPastryShop.entities.booths.PrivateBooth;
import Java_OOP.ChristmasPastryShop.entities.booths.interfaces.Booth;
import Java_OOP.ChristmasPastryShop.entities.cocktails.Hibernation;
import Java_OOP.ChristmasPastryShop.entities.cocktails.MulledWine;
import Java_OOP.ChristmasPastryShop.entities.cocktails.interfaces.Cocktail;
import Java_OOP.ChristmasPastryShop.entities.delicacies.Gingerbread;
import Java_OOP.ChristmasPastryShop.entities.delicacies.Stolen;
import Java_OOP.ChristmasPastryShop.entities.delicacies.interfaces.Delicacy;
import Java_OOP.ChristmasPastryShop.repositories.interfaces.BoothRepository;
import Java_OOP.ChristmasPastryShop.repositories.interfaces.CocktailRepository;
import Java_OOP.ChristmasPastryShop.repositories.interfaces.DelicacyRepository;

import static Java_OOP.ChristmasPastryShop.common.ExceptionMessages.BOOTH_EXIST;
import static Java_OOP.ChristmasPastryShop.common.ExceptionMessages.FOOD_OR_DRINK_EXIST;
import static Java_OOP.ChristmasPastryShop.common.OutputMessages.*;



public class ControllerImpl implements Controller {

    private DelicacyRepository<Delicacy> delicacyRepository;
    private CocktailRepository<Cocktail> cocktailRepository;
    private BoothRepository<Booth> boothRepository;
    private double income = 0;

    public ControllerImpl(DelicacyRepository<Delicacy> delicacyRepository, CocktailRepository<Cocktail> cocktailRepository, BoothRepository<Booth> boothRepository) {
        this.delicacyRepository = delicacyRepository;
        this.cocktailRepository = cocktailRepository;
        this.boothRepository = boothRepository;
    }


    @Override
    public String addDelicacy(String type, String name, double price) {
        Delicacy delicacy = delicacyRepository.getByName(name);
        if(delicacy != null) {
            throw new IllegalArgumentException(String.format(FOOD_OR_DRINK_EXIST, type, name));
        }
        delicacyRepository.add(DelicacyType.Gingerbread.name().equals(type)
                ? new Gingerbread(name, price)
                : new Stolen(name, price));
        return String.format(DELICACY_ADDED, name, type);
    }

    @Override
    public String addCocktail(String type, String name, int size, String brand) {
        Cocktail cocktail = cocktailRepository.getByName(name);
        if(cocktail != null) {
            throw new IllegalArgumentException(String.format(FOOD_OR_DRINK_EXIST, type, name));
        }
        cocktailRepository.add(CocktailType.MulledWine.name().equals(type)
                ? new MulledWine(name, size, brand)
                : new Hibernation(name, size, brand));
        return String.format(COCKTAIL_ADDED, name, brand);
    }

    @Override
    public String addBooth(String type, int boothNumber, int capacity) {
        Booth booth = boothRepository.getByNumber(boothNumber);
        if(booth != null) {
            throw new IllegalArgumentException(String.format(BOOTH_EXIST, boothNumber));
        }
        boothRepository.add(BoothType.PrivateBooth.name().equals(type)
                ? new PrivateBooth(boothNumber, capacity)
                : new OpenBooth(boothNumber, capacity));
        return String.format(BOOTH_ADDED, boothNumber);
    }

    @Override
    public String reserveBooth(int numberOfPeople) {

        Booth booth = boothRepository.getAll().stream()
                .filter(b -> !b.isReserved())
                .filter(b -> b.getCapacity() >= numberOfPeople)
                .findFirst().orElse(null);
        if(booth != null) {
            booth.reserve(numberOfPeople);
            return String.format(BOOTH_RESERVED, booth.getBoothNumber(), numberOfPeople);
        }
        return String.format(RESERVATION_NOT_POSSIBLE, numberOfPeople);
    }

    @Override
    public String leaveBooth(int boothNumber) {
        Booth byNumber = boothRepository.getByNumber(boothNumber);
        double bill = byNumber.getBill();
        this.income += bill;
        byNumber.clear();
        return String.format(BILL, boothNumber, bill);

    }

    @Override
    public String getIncome() {
        return String.format(TOTAL_INCOME, income);
    }
}
