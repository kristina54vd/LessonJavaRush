package org.example.kris.ProgramProject;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       while (true){
           Scanner scanner = new Scanner(System.in);
           System.out.println( " Это калькулят, введи число 1");
           double x = Double.parseDouble(scanner.nextLine());

           System.out.println(" Вве   дите тип расчета");
           String symbol = scanner.nextLine();
           System.out.println("Введите 2 число");
           double y = Double.parseDouble(scanner.nextLine());

           switch (symbol){
               case "+":
                   System.out.println(x + y);
                   break;
               case "-":
                   System.out.println(x - y);
                   break;
               case "*":
                   System.out.println(x * y);
                    break;
               case "/":
                   System.out.println( x / y);
                   break;
           }

       }
    }
}
