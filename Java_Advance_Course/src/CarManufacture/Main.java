package CarManufacture;

import java.util.*;

import static java.lang.Character.isLetter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> carList = new ArrayList<>();

        Map<String, Engine> engineMap = new HashMap<>();
        int count = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < count; i++) {

            String[] information = scanner.nextLine().split("\\s+");

            if (information.length == 4) {

                String engineModel = information[0];
                String power = information[1];
                int displacement = Integer.parseInt(information[2]);
                String efficiency = information[3];
                Engine engine = new Engine(engineModel, power, displacement, efficiency);
                engineMap.putIfAbsent(engineModel, engine);
            } else if (information.length == 3) {

                if (isLetter(information[2].charAt(0))) {
                    String engineModel = information[0];
                    String power = information[1];
                    String efficiency = information[2];
                    Engine engine = new Engine(engineModel, power, efficiency);
                    engineMap.putIfAbsent(engineModel, engine);
                } else {
                    String engineModel = information[0];
                    String power = information[1];
                    int displacement = Integer.parseInt(information[2]);
                    Engine engine = new Engine(engineModel, power, displacement);
                    engineMap.putIfAbsent(engineModel, engine);
                }
            } else if (information.length == 2) {
                String engineModel = information[0];
                String power = information[1];
                Engine engine = new Engine(engineModel, power);
                engineMap.putIfAbsent(engineModel, engine);
            }


        }
        count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String[] information = scanner.nextLine().split("\\s+");
            //"{Model} {Engine} {Weight} {Color}",
            if (information.length == 4) {
                String carModel = information[0];
                String engine = information[1];
                int weight = Integer.parseInt(information[2]);
                String color = information[3];
                Car car = new Car(carModel, weight, color, engineMap.get(engine));
                carList.add(car);
            } else if (information.length == 3) {
                if (isLetter(information[2].charAt(0))) {
                    String carModel = information[0];
                    String engine = information[1];
                    String color = information[2];
                    Car car = new Car(engineMap.get(engine),carModel, color);
                    carList.add(car);
                } else {
                    String carModel = information[0];
                    String engine = information[1];
                    int weight =Integer.parseInt(information[2]);
                    Car car = new Car(engineMap.get(engine),carModel,weight);
                    carList.add(car);

                }
            }else {
                String carModel = information[0];
                String engine = information[1];
                Car car = new Car(engineMap.get(engine),carModel);
                carList.add(car);
            }


        }

        for (Car car:carList) {
            String engine = car.getEngine().getEngineModel();

            System.out.printf("%s:%n" +
                            "%s:%n" +
                            "Power: %s%n" +
                            "Displacement: %s%n" +
                            "Efficiency: %s%n" +
                            "Weight: %s%n" +
                            "Color: %s%n", car.getCarModel(), engine, car.getEngine().getPower(), car.getEngine().getDisplacement()
                    , car.getEngine().getEfficiency(), car.getWeight(), car.getColor());
        }



    }
}
