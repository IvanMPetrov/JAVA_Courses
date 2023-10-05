package MapsAndAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Double> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!map.containsKey(name)){
                map.put(name,grade);
            }else {
                double currentGrade = map.get(name);
                double result = (currentGrade + grade) / 2;
                map.put(name,result);
            }
        }
        map.entrySet().forEach(entry -> {
            if (entry.getValue() >= 4.5) {
                System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
            }
        });

    }
}
