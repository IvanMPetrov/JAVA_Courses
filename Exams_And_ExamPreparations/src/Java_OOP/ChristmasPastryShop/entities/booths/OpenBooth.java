package Java_OOP.ChristmasPastryShop.entities.booths;

public class OpenBooth extends BaseBooth {

    public static final double pricePerPerson = 2.50d;

    public OpenBooth(int bootNumber, int capacity) {
        super(bootNumber, capacity, pricePerPerson);
    }
}
