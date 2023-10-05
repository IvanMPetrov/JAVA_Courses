package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        System.out.println((new DecimalFormat("0.####").format(Math.pow(n1,n2))));

    }

}
