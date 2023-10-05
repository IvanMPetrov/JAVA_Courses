package Arrays_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> phrasesList = new ArrayList<>();
        List<String> events = new ArrayList<>();
        List<String> authors = new ArrayList<>();
        List<String> cities = new ArrayList<>();

        phrasesList.add("Excellent product.");
        phrasesList.add("Such a great product.");
        phrasesList.add("I always use that product.");
        phrasesList.add("Best product of its category.");
        phrasesList.add("Exceptional product.");
        phrasesList.add("I can’t live without this product.");

        events.add("Now I feel good.");
        events.add("I have succeeded with this product.");
        events.add("Makes miracles.I am happy of the results!");
        events.add("I cannot believe but now I feel awesome.");
        events.add("Try it yourself, I am very satisfied.");
        events.add("I feel great!");

        authors.add("Diana");
        authors.add("Petya");
        authors.add("Stella");
        authors.add("Elena");
        authors.add("Katya");
        authors.add("Iva");
        authors.add("Annie");
        authors.add("Eva");

        cities.add("Burgas");
        cities.add("Sofia");
        cities.add("Plovdiv");
        cities.add("Varna");
        cities.add("Ruse");

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            Random rnd = new Random();
            int randomIndex = rnd.nextInt(phrasesList.size());
            int randomIndex1 = rnd.nextInt(events.size());
            int randomIndex2 = rnd.nextInt(authors.size());
            int randomIndex3 = rnd.nextInt(cities.size());
            System.out.printf("%s %s %s - %s%n",phrasesList.get(randomIndex),events.get(randomIndex1),authors.get(randomIndex2),cities.get(randomIndex3));
        }

    }
}
