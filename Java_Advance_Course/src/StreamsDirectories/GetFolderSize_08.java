package StreamsDirectories;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;

public class GetFolderSize_08 {
    public static void main(String[] args) throws IOException {

        File folder = new File("resources");

        ArrayDeque<File> directories = new ArrayDeque<>();
        directories.offer(folder);

        int sumOfBytes = 0;

        while (!directories.isEmpty()) {

            File currentFile = directories.poll();
            File[] files = currentFile.listFiles();

            for (File file : files) {
                if (file.isDirectory()) {
                    directories.offer(file);
                } else {
                    sumOfBytes += file.length();
                }
            }
        }
        System.out.println("Folder size: " + sumOfBytes);

    }
}
