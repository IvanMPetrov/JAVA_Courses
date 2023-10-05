package StreamsDirectories;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

public class AllCapitals_03 {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("resources/output.txt"));

        BufferedReader bf = Files.newBufferedReader(Paths.get("resources/input.txt"));


        bf.lines().forEach(line -> pw.println(line.toUpperCase(Locale.ROOT)));
        pw.close();
        bf.close();
    }
}
