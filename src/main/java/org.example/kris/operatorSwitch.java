package org.example.kris;//switch испокльзуется когда у нас есть много условий которые вы должны перебрать , вместо кучи else if  уддобнеее switch


import java.sql.SQLOutput;
import java.util.Scanner;

public class operatorSwitch {
    public static void main(String[] args) {
        int i = 0;
        while (i < 1){//бесконечный цикл
            Scanner scanner = new Scanner(System.in);//инициализация строки , то что принимает метод Scanner
            System.out.println("Выберите любимое блюдо:" + "гречка"+","+"курица" +","+"член");
            String ok = scanner.nextLine();//метод
            switch (ok) {// оператор switch сравнивает полученное выражение с очередным Значением (в порядке перечисления).

                case "гречка":
                    System.out.println("Вы ходите в качалку");
                    break;//Если встречается конструкция break — то управление передается за пределы команды switch.
                case "курица"://если необходимо выполнять один и тот же код для нескольких вариантов выбора, для исключения дублирования перед ним указываем несколько соответствующих значений в подряд идущих блоках case.
                    System.out.println("Вы любите животных");
                    break;
                case "член":
                    System.out.println("Вы любите мужчин");
                    i++;
                    break;
                default:
            }
        }


    }



}
