package RegularExpressions_Excercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        String nameReg = "[A-Za-z]+";
        String numberReg = "[0-9]";

        Map<String, Integer> map = new HashMap<>();
        for (String name : list) {
            map.put(name, 0);
        }


        while (!input.equals("end of race")) {

            Pattern namePattern = Pattern.compile(nameReg);
            Matcher nameMatcher = namePattern.matcher(input);

            StringBuilder nameBuilder = new StringBuilder();

            while (nameMatcher.find()) {
                nameBuilder.append(nameMatcher.group());
            }

            String nameBuild = nameBuilder.toString();

            if (map.containsKey(nameBuild)) {

                int distance = 0;
                Pattern numPattern = Pattern.compile(numberReg);
                Matcher numMatcher = numPattern.matcher(input);
                while (numMatcher.find()) {
                    distance += Integer.parseInt(numMatcher.group());

                }
                int currentDistance = map.get(nameBuild);
                map.put(nameBuild, currentDistance + distance);
            }
            input = scanner.nextLine();
        }
        List<String> nameOfFirstThree = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("1st place: " + nameOfFirstThree.get(0));
        System.out.println("2nd place: " + nameOfFirstThree.get(1));
        System.out.println("3rd place: " + nameOfFirstThree.get(2));

    }
}
