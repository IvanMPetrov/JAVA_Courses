package Java_OOP.SpaceStation;


import Java_OOP.SpaceStation.core.ControllerImpl;
import Java_OOP.SpaceStation.core.EngineImpl;
import Java_OOP.SpaceStation.core.interfaces.Engine;


public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl(new ControllerImpl());
        engine.run();

    }
}
