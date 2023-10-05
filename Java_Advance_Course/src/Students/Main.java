package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<Students> studentsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            String firstName = input.split(" ")[0];
            String secondName = input.split(" ")[1];
            double grade = Double.parseDouble(input.split(" ")[2]);
            Students students = new Students(firstName,secondName,grade);
            studentsList.add(students);
        }

        studentsList.sort(Comparator.comparing(Students::getGrade)
                .reversed());
        for (Students students : studentsList) {
            System.out.println(students.toString());
        }


    }
}
