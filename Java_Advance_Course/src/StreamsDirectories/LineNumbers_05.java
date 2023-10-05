package StreamsDirectories;

import java.io.*;

public class LineNumbers_05 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/inputLineNumbers.txt"));
        PrintWriter printWriter = new PrintWriter(new FileWriter("resources/output.txt"));

        String line = bufferedReader.readLine();
        int counter = 1;

        while (line != null) {

            printWriter.println(counter +". " + line);
            counter++;
            line = bufferedReader.readLine();
        }
        printWriter.close();
        bufferedReader.close();

    }
}
