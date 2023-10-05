package Java_OOP.ChristmasPastryShop.repositories.interfaces;

public interface DelicacyRepository<T> extends Repository<T> {
    T getByName(String name);
}
