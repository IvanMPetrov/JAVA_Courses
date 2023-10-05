package Java_OOP.ChristmasPastryShop.entities.cocktails;

public class MulledWine extends BaseCocktail {

    public static final double mulledWinePrice = 3.50d;

    public MulledWine(String name, int size, String brand) {
        super(name, size, mulledWinePrice, brand);
    }
}
