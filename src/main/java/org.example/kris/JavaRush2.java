package org.example.kris;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class JavaRush2 {
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)) {
           // Files.write(Path.of(scanner.nextLine()));
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
