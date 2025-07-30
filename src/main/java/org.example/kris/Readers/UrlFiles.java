package org.example.kris.Readers;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class UrlFiles {
    public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            URL url = new URL(line);
            InputStream input = url.openStream();
            byte[]buffer = input.readAllBytes();
            String str = new String(buffer);

            Path file = Files.createTempFile(null,null);
            Files.write(file,input.readAllBytes());

        }
            //напишите тут ваш код
        }

