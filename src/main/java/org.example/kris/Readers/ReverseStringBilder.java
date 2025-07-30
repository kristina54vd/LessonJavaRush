package org.example.kris.Readers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ReverseStringBilder {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        StringBuffer stringBuffer = new StringBuffer(result);
        stringBuffer.reverse();
        String reverseString = stringBuffer.toString();
        System.out.println(reverseString);
        //напишите тут ваш код
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}
