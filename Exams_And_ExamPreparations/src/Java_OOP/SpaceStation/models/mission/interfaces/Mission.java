package Java_OOP.SpaceStation.models.mission.interfaces;

import Java_OOP.SpaceStation.models.astronauts.interfaces.Astronaut;
import Java_OOP.SpaceStation.models.planets.interfaces.Planet;

import java.util.Collection;

public interface Mission {
    void explore(Planet planet, Collection<Astronaut> astronauts);
}
