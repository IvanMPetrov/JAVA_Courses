package ObjectsAndClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            String namePart = text.split(" ")[0];
            int agePart = Integer.parseInt(text.split(" ")[1]);

            if (agePart > 30) {
                Person person = new Person(namePart, agePart);
                personList.add(person);
            }

        }
        for (Person person: personList) {
            System.out.println(person.toString());
            System.out.println(person.getName() + " - " + person.getAge());
        }

    }
}
