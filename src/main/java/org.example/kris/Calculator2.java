package org.example.kris;

import java.util.Scanner;
public class Calculator2 {

    private static Scanner scanner;

    public Calculator2() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
       while (true){
           System.out.println("Это калькулятор, введи первое число");
           double x = Double.parseDouble(scanner.nextLine());

           System.out.println("Введите тип расчета");
           String symbol = scanner.nextLine();
           System.out.println("Введи второе число");
           double y = Double.parseDouble(scanner.nextLine());

           sum(x, symbol, y);
       }
    }

    private static void sum(double x, String ch, double y) {
        System.out.println(x+ch+y);
    }
}
