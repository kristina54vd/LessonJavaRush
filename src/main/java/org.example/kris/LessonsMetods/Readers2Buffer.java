package org.example.kris.LessonsMetods;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Readers2Buffer {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\Users\\Kristina\\java.test.txt"));
/*Здесь мы создали входящий поток данных FileInputStream (это одна из разновидностей InputStream),
передали в него путь к файлу, а сам поток передали InputStreamReader
 */

    }
}
/*InputStreamReader не только получает данные из потока. Он еще и преобразует байтовые потоки в символьные.
Иными словами, тебе уже не нужно самому заботиться о переводе считанных данных с “компьютерного” языка на “человеческий”
 */