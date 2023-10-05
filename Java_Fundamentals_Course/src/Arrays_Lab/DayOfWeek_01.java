package Arrays_Lab;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] daysOfWeek = new String[8];

        daysOfWeek [0]= "Invalid day!";
        daysOfWeek [1]= "Monday";
        daysOfWeek [2]= "Tuesday";
        daysOfWeek [3]= "Wednesday";
        daysOfWeek [4]= "Thursday";
        daysOfWeek [5]= "Friday";
        daysOfWeek [6]= "Saturday";
        daysOfWeek [7]= "Sunday";
        int num = Integer.parseInt(scanner.nextLine());
        if (num > 0 && num < 8){
            System.out.println(daysOfWeek[num]);
        }else {
            System.out.println("Invalid day!");
        }



    }
}
