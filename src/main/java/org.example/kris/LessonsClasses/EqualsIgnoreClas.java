package org.example.kris.LessonsClasses;

import java.util.Scanner;

public class EqualsIgnoreClas {
    public static String secret = "AmIGo";
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        String name1 = name.nextLine();
        if(name1.equalsIgnoreCase(secret)){
            //напишите тут ваш код
            System.out.println("доступ разрешен");
        }else{//напишите тут ваш код
            System.out.println("доступ запрещен");
        }
    }
}
