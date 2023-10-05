package Java_OOP.ChristmasPastryShop.repositories;

import Java_OOP.ChristmasPastryShop.entities.delicacies.interfaces.Delicacy;
import Java_OOP.ChristmasPastryShop.repositories.interfaces.DelicacyRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DelicacyRepositoryImpl implements DelicacyRepository<Delicacy> {

    Collection<Delicacy> models = new ArrayList<>();

    @Override
    public Delicacy getByName(String name) {
        return models.stream().filter(delicacy -> delicacy.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public Collection<Delicacy> getAll() {
        return Collections.unmodifiableCollection(models);
    }

    @Override
    public void add(Delicacy delicacy) {
        models.add(delicacy);
    }
}
