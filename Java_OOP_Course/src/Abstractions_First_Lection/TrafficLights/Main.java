package Abstractions_First_Lection.TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] lightsInput = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        List<TrafficLight> trafficLightList = new ArrayList<>();
        for (String light : lightsInput) {
            TrafficLight trafficLight = new TrafficLight(Color.valueOf(light));
            trafficLightList.add(trafficLight);
        }

        for (int i = 0; i < n; i++) {
            for (TrafficLight trafficLight : trafficLightList) {
                trafficLight.changeLight();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }




    }
}
