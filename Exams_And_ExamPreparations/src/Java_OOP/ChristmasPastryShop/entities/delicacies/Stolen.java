package Java_OOP.ChristmasPastryShop.entities.delicacies;

public class Stolen extends BaseDelicacy {

    public static final double InitialStolenPortion  = 250;

    public Stolen(String name, double price) {
        super(name, InitialStolenPortion, price);
    }
}
