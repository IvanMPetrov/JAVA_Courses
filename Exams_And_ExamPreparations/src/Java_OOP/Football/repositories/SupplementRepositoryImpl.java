package Java_OOP.Football.repositories;

import Java_OOP.Football.entities.supplement.interfaces.Supplement;
import Java_OOP.Football.repositories.interfaces.SupplementRepository;

import java.util.ArrayList;
import java.util.Collection;


public class SupplementRepositoryImpl implements SupplementRepository {

    private Collection<Supplement> supplements;

    public SupplementRepositoryImpl() {
        this.supplements = new ArrayList<>();
    }

    @Override
    public void add(Supplement supplement) {

        supplements.add(supplement);
    }

    @Override
    public boolean remove(Supplement supplement) {
        if (supplements.contains(supplement)) {
            supplements.remove(supplement);
            return true;
        }
        return false;
    }

    @Override
    public Supplement findByType(String type) {
       return supplements.stream().filter(supl -> supl.getClass().getSimpleName().equals(type))
               .findFirst().orElse(null);
    }
}
