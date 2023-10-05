package Java_OOP.ChristmasPastryShop.repositories;

import Java_OOP.ChristmasPastryShop.entities.booths.interfaces.Booth;
import Java_OOP.ChristmasPastryShop.repositories.interfaces.BoothRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BoothRepositoryImpl implements BoothRepository<Booth> {

    Collection<Booth> models = new ArrayList<>();

    @Override
    public Booth getByNumber(int number) {
        return models.stream().filter(booth -> booth.getBoothNumber() == number).findFirst().orElse(null);
    }

    @Override
    public Collection<Booth> getAll() {
        return Collections.unmodifiableCollection(models);
    }

    @Override
    public void add(Booth booth) {
        models.add(booth);
    }
}
