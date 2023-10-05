package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class Elevator_03 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int peopleNum = Integer.parseInt(scanner.nextLine());
    int capacity = Integer.parseInt(scanner.nextLine());

    int courses = 0;

    if (capacity >= peopleNum){
        System.out.println(1);

    }else if (peopleNum % capacity == 0){
        int sum = peopleNum / capacity;
        int people = peopleNum /sum;
        System.out.print(sum);

    }else {
        int sum = peopleNum / capacity;
        int sum2 = peopleNum % capacity;
        courses = sum + 1;
        System.out.print(courses);
    }

}
}
