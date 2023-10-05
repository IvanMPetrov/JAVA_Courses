package MapsAndAPI;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")){

            String name = input.split(" -> ")[0];
            String code = input.split(" ->")[1];

            if (!map.containsKey(name)){
                map.put(name,new ArrayList<>());
                map.get(name).add(code);
            }else if (!map.get(name).contains(code)){
                map.get(name).add(code);
            }
            input= scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {

            String name = entry.getKey();
            System.out.println(name);
            System.out.printf("--%s%n",String.join("\n--",entry.getValue()));

        }
        System.out.println();


    }
}
