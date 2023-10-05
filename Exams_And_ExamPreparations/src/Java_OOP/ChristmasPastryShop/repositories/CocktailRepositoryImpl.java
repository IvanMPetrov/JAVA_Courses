package Java_OOP.ChristmasPastryShop.repositories;

import Java_OOP.ChristmasPastryShop.entities.cocktails.interfaces.Cocktail;
import Java_OOP.ChristmasPastryShop.repositories.interfaces.CocktailRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CocktailRepositoryImpl implements CocktailRepository<Cocktail> {
    Collection<Cocktail> models = new ArrayList<>();

    @Override
    public Cocktail getByName(String name) {
        return models.stream().filter(cocktail -> cocktail.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public Collection<Cocktail> getAll() {
        return Collections.unmodifiableCollection(models);
    }

    @Override
    public void add(Cocktail cocktail) {
        models.add(cocktail);
    }
}
