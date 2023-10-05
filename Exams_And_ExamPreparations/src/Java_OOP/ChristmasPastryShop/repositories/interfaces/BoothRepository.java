package Java_OOP.ChristmasPastryShop.repositories.interfaces;

public interface BoothRepository<T> extends Repository<T> {
    T getByNumber(int number);
}
