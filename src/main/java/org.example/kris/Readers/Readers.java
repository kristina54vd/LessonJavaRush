package org.example.kris.Readers;

import java.io.IOException;

public class Readers {
    public static void main(String[] args) throws IOException {
        /*Потоки делятся на два вида:
Входящий поток (Input) — используется для приема данных
Исходящий поток (Output) — для отправки данных.
Байтовый поток передает информацию в виде набора байт
Символьный — в виде набора символов.*/
        while (true) {
            int x = System.in.read();//позволяет считывать данные
            System.out.println(x);
        }

    }
}
