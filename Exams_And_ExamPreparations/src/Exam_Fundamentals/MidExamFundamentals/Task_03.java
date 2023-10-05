package Exam_Fundamentals.MidExamFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> booksArray = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.contains("Done")) {
            if (command.contains("Add Book")) {

                String bookName = command.split(" \\| ")[1];

                if (isThereBook(booksArray, bookName)) {
                    booksArray.add(0, bookName);
                }

            } else if (command.contains("Take Book")) {

                String bookName = command.split(" \\| ")[1];
                if (!isThereBook(booksArray, bookName)) {
                    int position = positionOfTheBook(booksArray, bookName);
                    booksArray.remove(position);
                }

            } else if (command.contains("Swap Book")) {

                String firstBook = command.split(" \\| ")[1];
                String secondBook = command.split(" \\| ")[2];
                if (!isThereBook(booksArray, firstBook) && !isThereBook(booksArray, secondBook)) {
                    int positionFirstBook = positionOfTheBook(booksArray, firstBook);
                    int positionSecondBook = positionOfTheBook(booksArray, secondBook);

                    String firstElement = booksArray.get(positionFirstBook);
                    String secondElement = booksArray.get(positionSecondBook);
                    booksArray.set(positionFirstBook, secondElement);
                    booksArray.set(positionSecondBook, firstElement);
                }
            } else if (command.contains("Insert Book")) {

                String bookName = command.split(" \\| ")[1];
                if (isThereBook(booksArray, bookName)) {
                    booksArray.add(booksArray.size(), bookName);
                }

            } else if (command.contains("Check Book")) {

                int index = Integer.parseInt(command.split(" \\| ")[1]);
                if (index >= 0 && index < booksArray.size()) {

                    String bookAtIndex = booksArray.get(index);
                    System.out.println(bookAtIndex);
                }
            }
            command = scanner.nextLine();

        }
        for (int i = 0; i < booksArray.size(); i++) {
            if (i == booksArray.size()-1){
                System.out.print(booksArray.get(i));
                return;
            }
            System.out.print(booksArray.get(i) + ", ");

        }

    }

    private static boolean isThereBook(List<String> booksArray, String bookName) {
        for (int i = 0; i < booksArray.size(); i++) {
            String currentBook = booksArray.get(i);
            if (bookName.contains(currentBook)) {
                return false;
            }
        }
        return true;
    }

    private static int positionOfTheBook(List<String> booksArray, String bookName) {
        int position = 0;
        for (int i = 0; i < booksArray.size(); i++) {
            String currentBook = booksArray.get(i);
            if (bookName.contains(currentBook)) {
                position = i;
                return position;
            }

        }
        return position;
    }


}
