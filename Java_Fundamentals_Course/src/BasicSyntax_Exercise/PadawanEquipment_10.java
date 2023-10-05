package BasicSyntax_Exercise;

import java.util.Scanner;

public class PadawanEquipment_10 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    double moneyOwned = Double.parseDouble(scanner.nextLine());
    int numberOfStudents = Integer.parseInt(scanner.nextLine());
    double pricePerSaber = Double.parseDouble(scanner.nextLine());
    double pricePerRobe = Double.parseDouble(scanner.nextLine());
    double pricePerBelt = Double.parseDouble(scanner.nextLine());

    int freeBelts = numberOfStudents / 6;
    double percent = numberOfStudents + (numberOfStudents * 0.10);

    double calc1 = pricePerSaber * Math.ceil(percent);
    double calc2 = pricePerRobe * numberOfStudents;
    double calc3 = pricePerBelt * (numberOfStudents - freeBelts);
    double totalPrice = calc1 + calc2 + calc3;

    if (totalPrice > moneyOwned){
        double moneyNeeded = totalPrice - moneyOwned;
        System.out.printf("George Lucas will need %.2flv more.",moneyNeeded);
    }else{
        System.out.printf("The money is enough - it would cost %.2flv.",totalPrice,moneyOwned);
    }




}
}
