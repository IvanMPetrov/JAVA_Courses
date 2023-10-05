package Java_OOP.SpaceStation.repositories;



import Java_OOP.SpaceStation.models.planets.interfaces.Planet;
import Java_OOP.SpaceStation.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PlanetRepository implements Repository<Planet> {

    private Collection<Planet> planets = new ArrayList<>();


    @Override
    public Collection<Planet> getModels() {
        return planets.stream().collect(Collectors.toUnmodifiableList());
    }

    @Override
    public void add(Planet model) {
        planets.add(model);
    }

    @Override
    public boolean remove(Planet model) {
        return planets.remove(model);
    }

    @Override
    public Planet findByName(String name) {

        Planet planet = null;

        for (Planet currentPlanet : planets) {

            if (currentPlanet.getName().equals(name)) {
                planet = currentPlanet;
            }
        }
        return planet;

    }
}
