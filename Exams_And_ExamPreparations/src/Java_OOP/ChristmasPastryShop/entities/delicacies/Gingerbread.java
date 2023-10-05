package Java_OOP.ChristmasPastryShop.entities.delicacies;

public class Gingerbread extends BaseDelicacy {

    public static final double InitialGingerbreadPortion = 250;

    public Gingerbread(String name, double price) {
        super(name, InitialGingerbreadPortion, price);
    }
}
