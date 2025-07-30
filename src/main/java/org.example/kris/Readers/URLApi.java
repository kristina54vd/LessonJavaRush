package org.example.kris.Readers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

//обратиться к публичному API в интернете и получить данные. Напиши программу, которая будет обращаться по ссылке к публичному API в интернете, получать данные и выводить их на экран.
public class URLApi {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        URLConnection connection = url.openConnection();
        OutputStream stream = connection.getOutputStream();
        stream.write(1);

        InputStream input = connection.getInputStream();
       int data = input.read();
        System.out.println(input.toString());
    }
}
