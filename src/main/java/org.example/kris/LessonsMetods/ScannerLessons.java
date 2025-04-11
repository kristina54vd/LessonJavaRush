package org.example.kris.LessonsMetods;

import java.util.Scanner;

public class ScannerLessons {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Ввведди число");
         if(number.hasNextInt()){//метод проверяет, является ли следующая порция введенных данных числом, или нет (возвращает, соответственно, true или false).
             int numero = number.nextInt();// считывает и возвращает введенное число
             System.out.println("Вы ввели чило :");

         }else {
             System.out.println(("Ты дурак и не знаешь что такое число"));

             number.close();//закрытие метода
         }

    }

}
