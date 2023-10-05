package StreamsDirectories;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        BufferedReader bf = Files.newBufferedReader(Paths.get("resources/input.txt"));

        String line = bf.readLine();

        while (line != null){
            long  sum = 0;

            for (char symbol:line.toCharArray()) {

                sum += symbol;
            }
            System.out.println(sum);
            line = bf.readLine();
        }

    }
}
