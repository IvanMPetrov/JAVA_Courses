package Methods_Lab;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        gradeResult(grade);


    }

    private static void gradeResult (double n){
        if (n >= 2.00 && n <= 2.99){
            System.out.println("Fail");
        }else if (n <= 3.49){
            System.out.println("Poor");
        }else if (n <= 4.49){
            System.out.println("Good");
        }else if (n <= 5.49){
            System.out.println("Very good");
        }else if (n <= 6.00){
            System.out.println("Excellent");
        }
    }
}
