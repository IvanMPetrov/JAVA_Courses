package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> arrayLesson = Arrays.stream(scanner.nextLine().split(",")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.contains("course start")) {
            if (command.contains("Add")) {
                String lessonTitle = command.split(":")[1];
                if (doesNotExist(arrayLesson, lessonTitle)) {
                    arrayLesson.add(arrayLesson.size(), lessonTitle);
                }

            } else if (command.contains("Insert")) {
                String lessonTitle = command.split(":")[1];
                int position = Integer.parseInt(command.split(":")[2]);
                if (doesNotExist(arrayLesson, lessonTitle)) {
                    arrayLesson.add(position, lessonTitle);
                }
            } else if (command.contains("Remove")) {
                boolean removeExercise = false;
                String lessonTitle = command.split(":")[1];
                if (!doesNotExist(arrayLesson, lessonTitle)) {
                    int position = position(arrayLesson, lessonTitle);
                    arrayLesson.remove(position);
                    removeExercise = true;
                }
                if (removeExercise){
                    lessonTitle = lessonTitle +"-Exercise";
                    if (!doesNotExist(arrayLesson,lessonTitle)){
                        int position = position(arrayLesson, lessonTitle);
                        arrayLesson.remove(position);
                    }
                }
            } else if (command.contains("Swap")) {
                boolean swapExercise = false;
                String lessonTitle1 = command.split(":")[1];
                String lessonTitle2 = command.split(":")[2];
                if (!doesNotExist(arrayLesson, lessonTitle1) && !doesNotExist(arrayLesson, lessonTitle2)) {
                    int position1 = position(arrayLesson, lessonTitle1);
                    int position2 = position(arrayLesson, lessonTitle2);
                    String savedTitle = lessonTitle1;
                    arrayLesson.set(position1, lessonTitle2);
                    arrayLesson.set(position2, savedTitle);
                    swapExercise = true;
                }
                if (swapExercise){
                    lessonTitle1 = lessonTitle1 +"-Exercise";
                    lessonTitle2 = lessonTitle2 +"-Exercise";
                    if (!doesNotExist(arrayLesson,lessonTitle1)){
                        int position = position(arrayLesson, lessonTitle1);
                        arrayLesson.remove(position);
                    }
                    if (!doesNotExist(arrayLesson,lessonTitle2)){
                        int position = position(arrayLesson, lessonTitle1);
                        arrayLesson.remove(position);
                    }

                }
            } else if (command.contains("Exercise")) {
                String lessonTitle = command.split(":")[1];

                if (!doesNotExist(arrayLesson, lessonTitle)) {
                   int posititon = position(arrayLesson,lessonTitle);
                    lessonTitle = lessonTitle + "-Exercise";
                    arrayLesson.add(posititon + 1,lessonTitle);
                    command = scanner.nextLine();
                    continue;

                } else if (doesNotExist(arrayLesson, lessonTitle)) {
                    arrayLesson.add(arrayLesson.size(), lessonTitle);
                    lessonTitle = lessonTitle + "-Exercise";
                    arrayLesson.add(arrayLesson.size(), lessonTitle);
                }

            }
            command = scanner.nextLine();
        }
    }

    private static boolean doesNotExist(List<String> arrayLesson, String lessonTitle) {
        for (int i = 0; i < arrayLesson.size(); i++) {
            String currentElement = arrayLesson.get(i);
            if (currentElement.contains(lessonTitle)) {
                return false;
            }
        }
        return true;
    }

    private static int position(List<String> arrayLesson, String lessonTitle) {
        int position = 0;
        for (int i = 0; i < arrayLesson.size(); i++) {
            String currentElement = arrayLesson.get(i);
            if (currentElement.contains(lessonTitle)) {
                return i;
            }
        }
        return position;
    }
}
