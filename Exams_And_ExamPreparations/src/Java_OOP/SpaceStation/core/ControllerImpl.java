package Java_OOP.SpaceStation.core;

import Java_OOP.SpaceStation.core.interfaces.Controller;
import Java_OOP.SpaceStation.models.astronauts.Biologist;
import Java_OOP.SpaceStation.models.astronauts.Geodesist;
import Java_OOP.SpaceStation.models.astronauts.Meteorologist;
import Java_OOP.SpaceStation.models.astronauts.interfaces.Astronaut;
import Java_OOP.SpaceStation.models.mission.MissionImpl;
import Java_OOP.SpaceStation.models.planets.PlanetImpl;
import Java_OOP.SpaceStation.models.planets.interfaces.Planet;
import Java_OOP.SpaceStation.repositories.AstronautRepository;
import Java_OOP.SpaceStation.repositories.PlanetRepository;

import java.util.ArrayList;
import java.util.List;

import static Java_OOP.SpaceStation.common.ConstantMessages.*;
import static Java_OOP.SpaceStation.common.ExceptionMessages.*;


public class ControllerImpl implements Controller {

    private int planetsExplored;
    private AstronautRepository astroRepo = new AstronautRepository();
    private PlanetRepository planetRepository = new PlanetRepository();
    private MissionImpl mission = new MissionImpl();

    @Override
    public String addAstronaut(String type, String astronautName) {
        Astronaut astronaut = null;

        if (type.equals("Biologist")) {
            astronaut = new Biologist(astronautName);
        } else if (type.equals("Geodesist")) {
            astronaut = new Geodesist(astronautName);
        } else if (type.equals("Meteorologist")) {
            astronaut = new Meteorologist(astronautName);
        } else {
            throw new IllegalArgumentException(ASTRONAUT_INVALID_TYPE);
        }
        astroRepo.add(astronaut);
        return String.format(ASTRONAUT_ADDED, type, astronautName);
    }

    @Override
    public String addPlanet(String planetName, String... items) {
        Planet planet = new PlanetImpl(planetName);
        planetRepository.add(planet);
            for (String item : items) {
                planet.getItems().add(item);
            }
        return String.format(PLANET_ADDED,planetName);
    }

    @Override
    public String retireAstronaut(String astronautName) {
        Astronaut astronaut = astroRepo.findByName(astronautName);
        String output;

        if (astroRepo.remove(astronaut)) {
            output = String.format(ASTRONAUT_RETIRED, astronautName);
        } else {
            output = String.format(ASTRONAUT_DOES_NOT_EXIST, astronautName);
        }
        return output;
    }

    @Override
    public String explorePlanet(String planetName) {

        List<Astronaut> astronautList = new ArrayList<>();
        boolean atleastOneHasOxygen = false;

        for (Astronaut astro : astroRepo.getModels()) {

            if (astro.getOxygen() > 60) {
                atleastOneHasOxygen = true;
                astronautList.add(astro);
            }
        }
        if (atleastOneHasOxygen) {
            mission.explore(planetRepository.findByName(planetName), astronautList);
            planetsExplored++;
        }else {
            throw new IllegalArgumentException(PLANET_ASTRONAUTS_DOES_NOT_EXISTS);
        }
        int dead = 0;
        for (Astronaut astronaut : astronautList) {
            if (astronaut.getOxygen() == 0) {
                dead++;
            }
        }

        return String.format(PLANET_EXPLORED, planetName, dead);

    }

    @Override
    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(REPORT_PLANET_EXPLORED,planetsExplored)).append(System.lineSeparator());
        sb.append(REPORT_ASTRONAUT_INFO).append(System.lineSeparator());
        for (Astronaut astronaut:astroRepo.getModels()) {

            sb.append(String.format(REPORT_ASTRONAUT_NAME,astronaut.getName())).append(System.lineSeparator());

            sb.append(String.format(REPORT_ASTRONAUT_OXYGEN,astronaut.getOxygen())).append(System.lineSeparator());

            if (astronaut.getBag().getItems().isEmpty()){
                sb.append(String.format(REPORT_ASTRONAUT_BAG_ITEMS,"none")).append(System.lineSeparator());
            }else {

                String output = String.join(REPORT_ASTRONAUT_BAG_ITEMS_DELIMITER,astronaut.getBag().getItems());
                sb.append(String.format(REPORT_ASTRONAUT_BAG_ITEMS,output)).append(System.lineSeparator());

            }
        }
        return sb.toString();
    }
}
