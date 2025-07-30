package org.example.kris.Readers;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileReaders {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String strWrite = scanner.nextLine();
            Path str = Path.of(strWrite);
            if (Files.isRegularFile(Path.of(strWrite))) {
                System.out.println(strWrite + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(strWrite))) {
                System.out.println(strWrite + THIS_IS_DIR);


            } else if (strWrite.isEmpty()) {
                break;
            }else{
                break;
            }


        }
    }
}
