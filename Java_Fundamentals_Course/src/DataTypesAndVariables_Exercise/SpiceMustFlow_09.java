package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int starting = Integer.parseInt(scanner.nextLine());
    int total = 0;
    int counter = 0;
    int firstInput = starting;




    while (firstInput >= 100){

        starting = starting - 26;//85
        firstInput = firstInput - 10;
        counter++;
        total = total + starting;
        starting = firstInput;
    }
    if (total > 26){
        total = total - 26;
        System.out.println(counter);
        System.out.println(total);
    }else {
        System.out.println(counter);
        System.out.println(total);

    }




}
}
