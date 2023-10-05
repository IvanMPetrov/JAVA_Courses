package Java_OOP.SpaceStation.repositories;



import Java_OOP.SpaceStation.models.astronauts.interfaces.Astronaut;
import Java_OOP.SpaceStation.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class AstronautRepository implements Repository<Astronaut> {


    private Collection<Astronaut> astronauts = new ArrayList<>();



    @Override
    public Collection<Astronaut> getModels() {
        return astronauts.stream().collect(Collectors.toUnmodifiableList());
    }

    @Override
    public void add(Astronaut model) {

        astronauts.add(model);

    }

    @Override
    public boolean remove(Astronaut model) {
        return astronauts.remove(model);
    }

    @Override
    public Astronaut findByName(String name) {
        Astronaut astronaut = null;
        for (Astronaut astro : astronauts) {
            if (astro.getName().equals(name)) {
                astronaut = astro;
            }
        }
        return astronaut;
    }
}
