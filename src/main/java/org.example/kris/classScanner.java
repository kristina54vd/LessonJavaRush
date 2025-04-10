package org.example.kris;
import java.util.Scanner;//  класс Scanner  нужно импортировать этой командой , импорт класса сканер из  пакета и можем получать данные на вход
public class classScanner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// в парамерт этого класса(Scanner) задаем входной поток System.n -стандартный поток входных данных
        System.out.println("Напишите что -то");
        String name = s.nextLine();//метод класса Scaner ( nextLine()) -ссылаем на то что получено с клавиатуры
        System.out.println("Вы ввели : " + name + ", но это означает что вы гей");
    }

}

