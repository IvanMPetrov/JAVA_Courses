package Java_OOP.Football;

import Java_OOP.Football.core.EngineImpl;
import Java_OOP.Football.core.interfaces.Engine;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
