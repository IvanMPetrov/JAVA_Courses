package Exam_Fundamentals.ExamPreparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        String texte = scanner.nextLine();
        StringBuilder builder = new StringBuilder(texte);

        String input = scanner.nextLine();
        while (!input.equals("Travel")) {


            if (input.contains("Add Stop")) {
                int index = Integer.parseInt(input.split(":")[1]);
                if (isValid(index,builder)){
                    String beingAdded = input.split(":")[2];
                    builder.insert(index,beingAdded);
                }
            } else if (input.contains("Remove Stop")) {
                int index1 = Integer.parseInt(input.split(":")[1]);
                int index2 = Integer.parseInt(input.split(":")[2]);

                if (isValid(index1 , builder) && isValid(index2,builder)){

                    builder.delete(index1,index2 + 1);
                }
            } else if (input.contains("Switch")) {

                String text = input.split(":")[1];
                String toBeAdded = input.split(":")[2];

                if (texte.contains(text)){

                    String currentText = builder.toString().replace(text , toBeAdded);
                    builder = new StringBuilder(currentText);
                }


            }

            System.out.println(builder.toString());
            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n",builder.toString());

    }

    private static boolean isValid(int index, StringBuilder builder) {
        return index >= 0 && index <= builder.length() - 1;
    }
}
