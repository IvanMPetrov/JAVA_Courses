package ТextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        String[] foldersName = path.split("\\\\");

        String fullName = foldersName[foldersName.length -1];

        String name = fullName.split("\\.")[0];
        String extension = fullName.split("\\.")[1];

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);
    }
}
