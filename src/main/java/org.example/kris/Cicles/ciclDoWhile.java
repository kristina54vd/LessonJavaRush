package org.example.kris.Cicles;

import java.util.Scanner;

public class ciclDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// while  сперва читает инструкции , а потом выполняет условия . do{}while() - сперва читает условия потом выполняет инструкции
        int value; // цикл do{}while () гарантирует единократное выполнение , того что написано // декларирует "переменную " в пределах метода main,во избежании ошибок
        do {//вход
            System.out.println("Введи 5");
            value = scanner.nextInt();//ввод числа по переменную value
        } while (value!=5);//если оно равно 5 цикл завершается , если нет цикл возвращается
        System.out.println("Вы ввели 5");
    }
}
