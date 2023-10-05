package StreamsDirectories;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumBytes_02 {
    public static void main(String[] args)  throws IOException {

        BufferedReader bf = Files.newBufferedReader(Paths.get("resources/input.txt"));

        String line = bf.readLine();
        long  sum = 0;
        while (line != null){


            for (char symbol:line.toCharArray()) {

                sum += symbol;
            }

            line = bf.readLine();
        }
        System.out.println(sum);
    }
}
