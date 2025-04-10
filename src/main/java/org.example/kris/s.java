package org.example.kris;

import java.util.Scanner;

public class s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ты любишь есть? ");

        boolean ItsTrue = true;
    while (ItsTrue) {
        System.out.println("да");
        System.out.println("нет");
        String ok = scanner.nextLine();/// Scanner стопит программу и ожидает ввода


        do {
            if (ok.equals("да")) {

                System.out.println("Выбери что из списка ты любишь есть " + "гречка"+","+"курица" +","+"член"+"("+ok+")");
                String food = scanner.nextLine();// мы получаем значение из консоли и кладем ее в String food
                switch (food) {//switch начинает сравивать входящую переменную со всеми случаями case
                    case "гречка":
                        scanner.nextLine();
                        System.out.println("Вы ходите в качалку");
                        break;
                    case "курица":
                        scanner.nextLine();
                            System.out.println("Вы любите животных");
                            break;
                    case "член":
                        scanner.nextLine();
                             System.out.println("Вы любите мужчин");
                             break;
                }
            }
        }while (ok.equals("нет") );
        scanner.nextLine();
            System.out.println("Вы больны");
            break;
    }
    }
}
