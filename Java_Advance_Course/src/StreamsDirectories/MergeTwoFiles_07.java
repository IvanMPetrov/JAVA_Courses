package StreamsDirectories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MergeTwoFiles_07 {
    public static void main(String[] args) throws IOException {

        Path firstFile = Paths.get("resources/inputOne.txt");
        Path secondFile = Paths.get("resources/inputTwo.txt");

        PrintWriter printWriter = new PrintWriter("resources/output.txt");

        List<String> firstList = Files.readAllLines(firstFile);
        List<String> secondList = Files.readAllLines(secondFile);

        for (String el : firstList) {
            printWriter.println(el);
        }
        for (String el : secondList) {
            printWriter.println(el);
        }
        printWriter.close();


    }
}
